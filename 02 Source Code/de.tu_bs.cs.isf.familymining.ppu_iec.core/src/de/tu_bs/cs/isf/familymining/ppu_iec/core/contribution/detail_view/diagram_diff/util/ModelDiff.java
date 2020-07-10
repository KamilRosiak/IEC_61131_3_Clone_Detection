package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;

import com.google.common.collect.Multimap;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.elements.LDHorizontalConnector;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.elements.LDLConnector;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.string_table.GDVStringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.util.ld.LDNameUtil;
import javafx.scene.layout.GridPane;

/**
 * util class that helps the GraphicalDetailView to create the diff between two ladderdiagrams
 * @author Domenik Eichhorn, Eike Schmitz, Ziad Alhajjar
 */
public class ModelDiff {
	
	//default values for coloring
	private float mandatory_case = 1f;
	private float alternative_case = 0.99f;
	private float optional_case = 0f;
	//private float uncompared = -1f;
	
	Map<DiagramElement, Float> similarityMap;
	
	/**
	 * creates a model diff and adds the graphical elements to the given panes
	 * @param elementMap - a String, String Multimap of elements that should be compared (source and target keys)
	 * @param sourcePane - the pane where the source elements should be added
	 * @param targetPane - the pane where the target elements should be added
	 */
	public void createModelDiff(Multimap<String, DiagramElement> elementMap, Map<DiagramElement, Float> similarityMap, GridPane sourcePane, GridPane targetPane) {
		//check for null
		if (elementMap == null || sourcePane == null || targetPane == null) {
			return;
		}
		this.similarityMap = similarityMap;
		//fill source:
		ArrayList<DiagramElement> sourceList = new ArrayList<DiagramElement>(elementMap.get(GDVStringTable.SOURCE_KEY));
		targetFillPane(sourceList, GDVStringTable.SOURCE_KEY, sourcePane);
		//fill target:
		ArrayList<DiagramElement> targetList = new ArrayList<DiagramElement>(elementMap.get(GDVStringTable.TARGET_KEY));
		targetFillPane(targetList, GDVStringTable.TARGET_KEY, targetPane);
	}
	/**
	 * paints the ladder diagram with a given set of DiagramElements using information about the target elements
	 * when not parallel and .getLevel() works, connectors are always created at the place level*2 and elements are created at level*2 + 1
	 * @param elementList - list of DiagramElements that should be created
	 * @param key that identifies source or target pane (needed for coloring)
	 * @param pane where the diagram should be painted
	 */	
	private void targetFillPane (ArrayList<DiagramElement> elementList, String key, GridPane pane) {
		//paint DiagramElements with level and source information
		List<GUIPair> paintedElements = new ArrayList<GUIPair>();
		int parallelCount = 0;
		for (int i = 0; i < elementList.size(); i++) {
			DiagramElement currentElement = elementList.get(i);
			if (currentElement == null) {
				continue;
			}
			//first element gets no special behavior
			if (i == 0) {
				ElementMapper.mapObject(currentElement, getColor(currentElement, key), pane, 0, 0);
				paintedElements.add(new GUIPair(currentElement, 0));
				continue;
			}
			DiagramElement previousElement = elementList.get(i - 1);
			EList<DiagramElement> sourceElements = currentElement.getSourceElements();
			//EList<DiagramElement> targetElements = currentElement.getTargetElements();
			//ignore RIGHT_POWERRAILS:
			if (LDNameUtil.getName(currentElement).equals("RIGHT_POWERRAIL")) {
				continue;
			}
			int column;
			//check if the previous element has the some level:
			try {
				column = currentElement.getLevel() * 2;
				if (previousElement.getLevel() == currentElement.getLevel()) {
					//if the current element only has one source and the source is different to the previous elements source, there could be a empty space which has to be added up 
					if (sourceElements.size() == 1 && !(previousElement.getSourceElements().contains(sourceElements.get(0)))) {
						int temp = parallelCount + 1;
						for (GUIPair GUIelement : paintedElements) {
							if (sourceElements.get(0).equals(GUIelement.element)) {
								parallelCount = GUIelement.row;
							}
						}
						//add fill elements:
						for (int j = temp; j < parallelCount; j++) {
							pane.add(new LDHorizontalConnector(GDVStringTable.COLOR_BLACK), column, j);
							pane.add(new LDHorizontalConnector(0.47, GDVStringTable.COLOR_BLACK), column + 1, j);
						}
					} else { //when this is not the case, just increase parallelCount and leave nothing empty
						parallelCount++;
					}
					//decide connector type: (L or -)
					EList<DiagramElement> previousSourceElements = previousElement.getSourceElements();
					boolean paintedConnector = false;
					for (int j = 0; j < sourceElements.size(); j++) {
						for (int k = 0; k < previousSourceElements.size(); k++) {
							if (sourceElements.get(j) == previousSourceElements.get(k)) {
								pane.add(new LDLConnector(GDVStringTable.COLOR_BLACK, false), column, parallelCount - 1, 1, 2);
								paintedConnector = true;
							}
						}
					}
					if (!paintedConnector) {
						pane.add(new LDHorizontalConnector(GDVStringTable.COLOR_BLACK), column, parallelCount);
					}
					//paint the actual object after the connector:
					ElementMapper.mapObject(currentElement, getColor(currentElement, key), pane, column + 1, parallelCount);
					paintedElements.add(new GUIPair(currentElement, parallelCount));
					continue;
				}
			} catch (NullPointerException e) {
				column = i * 2; //just in case when getLevel() does not work
			}
			//source element should never be zero, but just in case, here is a check: (with warning)
			if (sourceElements.size() == 0) {
				ElementMapper.mapObject(currentElement, getColor(currentElement, key), pane, column + 1, 0);
				paintedElements.add(new GUIPair(currentElement, 0));
				System.out.println("Warning at DetailView: element " + LDNameUtil.getName(currentElement) + " had no source");
				System.out.println("this occured at the ModellDiff.targetFillPane() method in the GraphicalDetailView");
			}
			//when there is only one source element and we are not parallel, always paint a - connector
			//has to check for the row of the source element to decide in which row we paint
			else if (sourceElements.size() == 1) {
				int row = 0;
				for (int j = 0; j < paintedElements.size(); j++) {
					if (paintedElements.get(j).element == sourceElements.get(0)) {
						row = paintedElements.get(j).row;
						System.out.println(LDNameUtil.getName(paintedElements.get(j).element) + ":" + row);
					}
					
				}
				pane.add(new LDHorizontalConnector(GDVStringTable.COLOR_BLACK), column, row);
				ElementMapper.mapObject(currentElement, getColor(currentElement, key), pane, column + 1, row);
				paintedElements.add(new GUIPair(currentElement, row));
				//when row is greater 0, add a fill element one above
				if (row > 0) {
					for (int j = 0; j < row; j++) {
						pane.add(new LDHorizontalConnector(GDVStringTable.COLOR_BLACK), column, j);
						pane.add(new LDHorizontalConnector(0.47, GDVStringTable.COLOR_BLACK), column + 1, j);
					}
					parallelCount = row;
					continue;
				}
			}
			//decide mirrored L or - when there is more than one source
			else if (sourceElements.size() > 1) {
				//get sourceElement with biggest row and lowest row and set biggestRow
				int biggestRow = 1;
				int lowestRow = 1;
				boolean setInitialLowest = false;
				for (GUIPair currentPainted : paintedElements) {
					for (DiagramElement currentSource : sourceElements) {
						if (currentPainted.element.equals(currentSource) && currentPainted.row > biggestRow) {
							biggestRow = currentPainted.row;
						} else if (currentPainted.element.equals(currentSource) && !setInitialLowest) {
							lowestRow = currentPainted.row;
							setInitialLowest = true;
						} else if (currentPainted.element.equals(currentSource) && setInitialLowest && currentPainted.row < lowestRow) {
							lowestRow = currentPainted.row;
						}
					}
				}
				//paint at least one mirrored L and one - connector:
				//L connector is painted on the highest row
				pane.add(new LDLConnector(GDVStringTable.COLOR_BLACK, true), column, biggestRow - 1, 1, 2);
				pane.add(new LDHorizontalConnector(GDVStringTable.COLOR_BLACK), column, lowestRow);
				//if biggestRow > 1, add one vertical connector for each row remaining
				//start from row zero
				if (biggestRow > 1) {
					for (int j = 0; j < biggestRow - 1; j++) {
						pane.add(new LDLConnector(GDVStringTable.COLOR_BLACK, true), column, j, 1, 2);
					}
				}
				//fill empty places with - connectors:
				for (GUIPair pair : paintedElements) {
					DiagramElement element = pair.element;
					if (element.getTargetElements().contains(currentElement)) {
						for (int j = 1; j < currentElement.getLevel() - element.getLevel(); j++) {
							int tempColumn = (element.getLevel() + j) * 2;
							pane.add(new LDHorizontalConnector(GDVStringTable.COLOR_BLACK), tempColumn, pair.row);
							pane.add(new LDHorizontalConnector(0.47, GDVStringTable.COLOR_BLACK), tempColumn + 1, pair.row);
						}
					}
				}
				ElementMapper.mapObject(currentElement, getColor(currentElement, key), pane, column + 1, lowestRow);
				paintedElements.add(new GUIPair(currentElement, lowestRow));
			}
			parallelCount = 0;
		}
	}
	
	/**
	 * calculates the color, which is different for source and target element
	 * color id 0 is black, 1 is green, 2 is red
	 * @param element that should be checked
	 * @return color value
	 */
	private int getColor(DiagramElement element, String key) {
		//get similarity from the element:
		float similarity = similarityMap.getOrDefault(element, 1f);
		if (similarity >= mandatory_case) {
			return GDVStringTable.COLOR_BLACK;
		} else if (similarity >= alternative_case) {
			if (key.equals(GDVStringTable.SOURCE_KEY)) {
				return GDVStringTable.COLOR_YELLOW;
			} else if (key.equals(GDVStringTable.TARGET_KEY)) {
				return GDVStringTable.COLOR_ORANGE;
			} else {
				return GDVStringTable.COLOR_BLACK;
			}
		} else if (similarity >= optional_case) {
			return GDVStringTable.COLOR_BLUE;
		} else { //uncompared
			return GDVStringTable.COLOR_RED;
		}
	}
}
