package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.text_diff.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class LineMatcher {

	private static final int MIN_NEIGHBOURHOOD = 5;

	public static Integer NO_MATCH = -1;
	
	private static List<String> sourceText = new ArrayList<>();
	private static List<String> targetText = new ArrayList<>();
	
	private static List<Integer> markedSourceLines = new ArrayList<>();
	private static Map<Integer,Integer> sourceIndexMap = new HashMap<>();
	
	public static Map<Integer, Integer> match(List<String> sourceText, List<String> targetText) {
		markedSourceLines.clear();
		sourceIndexMap.clear();
		LineMatcher.sourceText = sourceText;
		LineMatcher.targetText = targetText;
		
		// 1. Step: match all non-empty lines
		for (int targetIndex = 0; targetIndex < targetText.size(); targetIndex++) {
			if (!targetText.get(targetIndex).isEmpty()) {
				int correspondingSourceIndex = getNonEmptyLineMatching(targetIndex);
				markedSourceLines.add(correspondingSourceIndex);
				sourceIndexMap.put(targetIndex, correspondingSourceIndex);				
			}
		}
		
		
		// 2. Step: match all empty lines
		for (int targetIndex = 0; targetIndex < targetText.size(); targetIndex++) {
			if (targetText.get(targetIndex).isEmpty()) {
				int correspondingSourceIndex = getEmptyLineMatching(targetIndex);
				markedSourceLines.add(correspondingSourceIndex);
				sourceIndexMap.put(targetIndex, correspondingSourceIndex);				
			}
		}
		return sourceIndexMap;
	}
	
	private static int getNonEmptyLineMatching(int targetIndex) {
		int matchedIndex;
		String targetLine = targetText.get(targetIndex);
		List<Integer> sourceCandidates = new ArrayList<>();

		for (int i = 0; i < sourceText.size(); i++) {
			String sourceLine = sourceText.get(i);
			if (targetLine.trim().equals(sourceLine.trim()) && !markedSourceLines.contains(i)) {
				sourceCandidates.add(i);	
			}
		}
		if (sourceCandidates.size() == 0) {
			matchedIndex = NO_MATCH;
		} else if (sourceCandidates.size() == 1) {
			matchedIndex = sourceCandidates.get(0);
		} else {
			matchedIndex = matchBestIndex(targetIndex, sourceCandidates);
		}
		return matchedIndex;
	}
	
	private static int matchBestIndex(int targetIndex, List<Integer> sourceCandidates) {
		int matchedIndex = Integer.MAX_VALUE;
		for (Integer sourceCandidate : sourceCandidates) {
			int curlineDistance = Math.abs(sourceCandidate - targetIndex); 
			if (curlineDistance < Math.abs(matchedIndex - targetIndex)) {
				matchedIndex = sourceCandidate;
			}
		}
		assert (matchedIndex != Integer.MAX_VALUE) : "line match error";
		return matchedIndex;
	}

	private static int getEmptyLineMatching(int targetIndex) {
		// find neighbours of targetIndex
		int leftNeighbour = targetIndex - 1;
		int rightNeighbour = targetIndex + 1;
		
		// collect non-matched empty lines
		List<Integer> emptyLineCandidates = new ArrayList<>();
		for (int sourceIndex = 0; sourceIndex < sourceText.size(); sourceIndex++) {
			if (sourceText.get(sourceIndex).isEmpty() && !markedSourceLines.contains(sourceIndex)) {
				emptyLineCandidates.add(sourceIndex);
			}
		}
		
		// find empty line that has the same neighbours as the target empty line
		for (int emptySourceLineIndex : emptyLineCandidates) {
			Integer leftBound = sourceIndexMap.get(leftNeighbour);
			Integer rightBound = sourceIndexMap.get(rightNeighbour);
			if (leftBound != null && rightBound != null && leftBound != -1 && rightBound != -1) {
				if (leftBound < emptySourceLineIndex && emptySourceLineIndex < rightBound) {
					return emptySourceLineIndex;
				}
			}
		}	
		
		for (int emptySourceLineIndex : emptyLineCandidates) {
			if (Math.abs(emptySourceLineIndex - targetIndex) < MIN_NEIGHBOURHOOD) {
				return emptySourceLineIndex;
			}
		}
		
		return NO_MATCH;
	}
}
