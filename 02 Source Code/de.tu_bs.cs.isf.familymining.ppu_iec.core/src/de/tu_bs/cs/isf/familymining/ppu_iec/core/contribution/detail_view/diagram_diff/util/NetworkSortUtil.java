package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.util;

import org.eclipse.emf.common.util.EList;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement;

/**
 * @author Domenik Eichhorn
 */
public class NetworkSortUtil {
	
	/**
	 * sorts the given list of elements for LocalId
	 * uses bubble sort with swapped
	 * @param elementList
	 * @return sorted elementList
	 */
	public static EList<DiagramElement> sortElementsForLocalID(EList<DiagramElement> elementList) {
		boolean swapped = false;
		do {
			swapped = false;
			for (int i = 0; i < elementList.size() - 1; i++) {
				DiagramElement currentElement = elementList.get(i);
				DiagramElement nextElement = elementList.get(i + 1);
				int currentId = Integer.parseInt(currentElement.getLocalId());
				int nextId = Integer.parseInt(nextElement.getLocalId());
				if (currentId > nextId) {
					//swap:
					elementList.remove(currentElement);
					elementList.add(i + 1, currentElement);
					swapped = true;
				}
			} 
		} while (swapped == true);
		return elementList;
	}
	
	/**
	 * sorts the given list of elements for the ModelDiff
	 * uses bubble sort with swapped
	 * @param elementList
	 * @return sorted elementList
	 */
	public static EList<DiagramElement> sortElementsForDiff(EList<DiagramElement> elementList) {
		//sort for LocalId first:
		elementList = sortElementsForLocalID(elementList);
		//now also sort for parallel elements and level:
		for (int i = 1; i < elementList.size(); i++) {
			for (int j = i; j < elementList.size(); j++) {
				DiagramElement currentElement = elementList.get(j);
				DiagramElement previousElement = elementList.get(j - 1);
				int currentId = Integer.parseInt(currentElement.getLocalId());
				int prevId = Integer.parseInt(previousElement.getLocalId());
				if (currentId > prevId && currentElement.getLevel() < previousElement.getLevel()) {
					//swap:
					elementList.remove(currentElement);
					elementList.add(j - 1, currentElement);
				}
			}
		}
		return elementList;
	}
}
