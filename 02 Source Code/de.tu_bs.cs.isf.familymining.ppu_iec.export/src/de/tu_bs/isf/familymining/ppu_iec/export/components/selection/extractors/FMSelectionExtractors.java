package de.tu_bs.isf.familymining.ppu_iec.export.components.selection.extractors;

import org.eclipse.swt.widgets.Tree;

import de.tu_bs.isf.familymining.ppu_iec.export.components.selection.FMSelection;
import de.tu_bs.isf.familymining.ppu_iec.export.components.treebuilders.SelectionFMTreeBuilder;

/**
 * Implementations of {@link FMSelectionExtractor}, beeing able to extract
 * {@link FMSelection}-Instances from given Types.
 * 
 * @author Fabian Ochmann
 *
 */
public class FMSelectionExtractors {

	private FMSelectionExtractors() {
	}

	/**
	 * Return an Extractor able to extract a {@link FMSelection} from a Tree created
	 * by a {@link SelectionFMTreeBuilder}.
	 * 
	 * @return An Extractor able to extract a {@link FMSelection} from a Tree
	 *         created by a {@link SelectionFMTreeBuilder}.
	 */
	public static FMSelectionExtractor<Tree> fromTree() {
		return new FMSelectionTreeExtractor();
	}

}
