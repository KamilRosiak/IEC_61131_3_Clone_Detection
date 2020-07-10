package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.text_diff.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

public class DiffText {

	enum AtomicPatch {DELETION, INSERTION, NO_CHANGE, MOVE};
	
	private static final String MOVE_SYMBOL = "[<-->]";
	
	private Table source;
	private Table target;
	
	private List<String> sourceResultText = new ArrayList<>();
	private List<String> targetResultText = new ArrayList<>();
	private List<Integer> markedSourceLines = new ArrayList<>();
	private Map<Integer,Integer> sourceIndexMap = new HashMap<>();
	
	public DiffText(Table source, Table target) {
		this.source = source;
		this.target = target;
	}
	
	public void diff(String sourceText, String targetText) {
		 List<String> sourceLines = getLines(sourceText);
		 List<String> targetLines = getLines(targetText);
		 diff(sourceLines, targetLines);
	}

	private List<String> getLines(String sourceText) {
		if (sourceText == null) {
			return null;
		}
		String[] lines = sourceText.split("\\r?\\n");
		 List<String> sourceLines = Arrays.asList(lines);
		return sourceLines;
	}
	
	public void diff(List<String> sourceText, List<String> targetText) {
		markedSourceLines.clear();
		sourceResultText.clear();
		targetResultText.clear();
		sourceIndexMap.clear();
		List<Integer> swappedSourceLineList = new ArrayList<>();
		List<Integer> swappedTargetLineList = new ArrayList<>();
		
		if (sourceText == null && targetText == null) {
			return;
		} else if (sourceText == null && targetText != null) {
			for (int index = 0; index < targetText.size(); index++) {
				addDiffLine("", targetText.get(index), AtomicPatch.NO_CHANGE);				
			}
		} else if (sourceText != null && targetText == null) {
			for (int index = 0; index < sourceText.size(); index++) {
				addDiffLine(sourceText.get(index), "", AtomicPatch.NO_CHANGE);				
			}
		} else {
			sourceIndexMap = LineMatcher.match(sourceText, targetText);
			
			Integer sourceIndex = 0;
			Integer targetIndex = 0;
			while (targetIndex < targetText.size() || sourceIndex < sourceText.size()) {
				Integer mappedSourceIndex = sourceIndexMap.get(targetIndex);
				if (!sourceIndexMap.containsValue(sourceIndex) || (mappedSourceIndex != null && mappedSourceIndex.intValue() == LineMatcher.NO_MATCH)) {
					if (mappedSourceIndex == LineMatcher.NO_MATCH) { // no match for target
						addDiffLine("", targetText.get(targetIndex), AtomicPatch.INSERTION);
						targetIndex++;
					} else if (!sourceIndexMap.containsValue(sourceIndex)) { // no match for source
						addDiffLine(sourceText.get(sourceIndex), "", AtomicPatch.DELETION);
						sourceIndex++;
					}
				} else if (swappedTargetLineList.contains(targetIndex)) {
					addDiffLine("", targetText.get(targetIndex), AtomicPatch.MOVE);
					targetIndex++;
				} else if (swappedSourceLineList.contains(sourceIndex)) { // source was recently marked as swapped
					addDiffLine(sourceText.get(sourceIndex), "", AtomicPatch.MOVE);
					sourceIndex++;
				} else if (mappedSourceIndex.intValue() == sourceIndex.intValue()) { // target and source are equal
					addDiffLine(sourceText.get(sourceIndex), targetText.get(targetIndex), AtomicPatch.NO_CHANGE);
					sourceIndex++;
					targetIndex++;
				} else if (isLineSwapMapping(targetIndex)) { // target mapping onto source crosses other matchings -> line swap
					addDiffLine("", targetText.get(targetIndex), AtomicPatch.MOVE);
					swappedSourceLineList.add(mappedSourceIndex);
					targetIndex++;
				} else if (isLineSwapUpwards(sourceIndex, targetIndex, swappedTargetLineList)) {
					addDiffLine(sourceText.get(sourceIndex), "", AtomicPatch.MOVE);
					sourceIndex++;
				} else {
					System.out.println("INVALID MATCHING OPERATION");
				}		
			}	
		}
	}

	private boolean isLineSwapUpwards(Integer sourceIndex, Integer targetIndex, List<Integer> swappedTargetLineList) {
		if (sourceIndex != null && targetIndex != null) {
			if (sourceIndex > targetIndex) {
				return false;
			}
			
			for (int curTargetIndex = targetIndex + 1; sourceIndexMap.get(curTargetIndex) != null; curTargetIndex++) {
				Integer curSourceIndex = sourceIndexMap.get(curTargetIndex);
				if (curSourceIndex.equals(sourceIndex)) {
					swappedTargetLineList.add(curTargetIndex);
					return true;
				}
			}			
		}
		return false;
	}

	private boolean isLineSwapMapping(Integer targetIndex) {
		Integer mappedSourceIndex = sourceIndexMap.get(targetIndex);
		if (mappedSourceIndex != null) {
			if (mappedSourceIndex < targetIndex) {
				return false;
			}
			
			for (int curTargetIndex = targetIndex + 1; sourceIndexMap.get(curTargetIndex) != null; curTargetIndex++) {
				Integer curSourceIndex = sourceIndexMap.get(curTargetIndex);
				if (curSourceIndex < mappedSourceIndex) {
					return true;
				}
			}			
		}
		return false;
	}
	
	private void addDiffLine(String sourceLine, String targetLine, AtomicPatch patchType) {
		String optionalSymbol = "";
		TableItem sourceLineItem = new TableItem(source, SWT.NONE);
		if (!sourceLine.trim().isEmpty()) {
			if (patchType == AtomicPatch.MOVE) {
				optionalSymbol = " " + MOVE_SYMBOL;
			}
			sourceLineItem.setText(new String[] {sourceLine+optionalSymbol});							
		}
		TableItem targetLineItem = new TableItem(target, SWT.NONE);
		if (!targetLine.trim().isEmpty()) {
			if (patchType == AtomicPatch.MOVE) {
				optionalSymbol = " " + MOVE_SYMBOL;
			}
			targetLineItem.setText(new String[] {targetLine+optionalSymbol});
		}
		
		if (patchType == AtomicPatch.DELETION) {
			sourceLineItem.setBackground(getDeletionColor());
			targetLineItem.setBackground(getFillSpaceColor());
		} else if (patchType == AtomicPatch.INSERTION) {
			targetLineItem.setBackground(getInsertionColor());
			sourceLineItem.setBackground(getFillSpaceColor());
		} else if (patchType == AtomicPatch.MOVE) {
			if (sourceLine.isEmpty()) {
				sourceLineItem.setBackground(getFillSpaceColor());
				targetLineItem.setBackground(getMoveColor());
			}
			if (targetLine.isEmpty()) {
				targetLineItem.setBackground(getFillSpaceColor());
				sourceLineItem.setBackground(getMoveColor());
			}
		}
	}
	
	public Color getDeletionColor() {
		return new Color(Display.getCurrent(), 255, 120, 120);
	}
	
	public Color getInsertionColor() {
		return new Color(Display.getCurrent(), 120, 255, 120);
	}
	
	public Color getMoveColor() {
		return new Color(Display.getCurrent(), 255, 255, 120);
	}
	
	public Color getFillSpaceColor() {
		return new Color(Display.getCurrent(), 230, 230, 230);
	}
}
