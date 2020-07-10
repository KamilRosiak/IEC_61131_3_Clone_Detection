package de.tu_bs.isf.familymining.ppu_iec.export.components.selection.extractors;

import de.tu_bs.isf.familymining.ppu_iec.export.components.selection.FMSelection;

/**
 * Classes implementing this interface are implement the ability to extract a
 * {@link FMSelection} from a given Type.
 * 
 * @author Fabian Ochmann
 *
 * @param <Source> The type from which the Extractor is able to extract a
 *                 {@link FMSelection}.
 */
public interface FMSelectionExtractor<Source> {

	public FMSelection extract(Source source);

}
