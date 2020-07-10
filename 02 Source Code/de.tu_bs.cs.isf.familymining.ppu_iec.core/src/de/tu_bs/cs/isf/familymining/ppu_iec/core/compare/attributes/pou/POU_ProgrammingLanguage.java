package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.pou;

import java.util.List;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractPOUAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChart;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredText;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class POU_ProgrammingLanguage extends AbstractPOUAttribute{
	/**
	 * 
	 * @author Bougouffa
	 */
	private static final long serialVersionUID = 1L;
	public static final String MODUL_NAME = "Programming Language of a POU";
	public static final String MODUL_DESCRIPTION = "Evaluates the programming languages implemented in the selected POUs";
	
	public POU_ProgrammingLanguage() {
		super(MODUL_NAME, MODUL_DESCRIPTION);
	}

	@Override
	public ResultElement<POU> compare(POU pou1, POU pou2) {
		/*Gets the list of all programming languages (Language Elements) per POU and compares them*/
		
		List<LanguageElement> pou1_progLang = pou1.getImplementations();
		List<LanguageElement> pou2_progLang = pou2.getImplementations();		
		
		float similarity;
		
		if(pou1_progLang.size() == 0 || pou2_progLang.size() == 0) {
			similarity = 0f;
		} else {
			similarity = compare(pou1_progLang,pou2_progLang);
		}

		return new ResultElement<POU>(pou1, pou2, similarity, this);
	}

	private float compare(List<LanguageElement> pou1_progLang, List<LanguageElement> pou2_progLang) {
		/*Compares all the elements from the first list pou1_progLang with every element in the second list
		 pou2_progLang by equaling the Language Element.
		 If they are equal, then a full match is recorded.
		 The number of matches is then returned divided by the maximum size of both lists */
		
		
		//TODO: Alex verify
		float accumulator = 0f;
		for(LanguageElement sourceElement : pou1_progLang) {
			for(LanguageElement targetElement : pou2_progLang) {
				targetElement.equals(sourceElement);
				if(sourceElement instanceof StructuredText && targetElement instanceof StructuredText) {
					accumulator += 1f;
					break;
				}
				if(sourceElement instanceof SequentialFunctionChart && targetElement instanceof SequentialFunctionChart) {
					accumulator += 1f;
					break;
				}
			}
		}
		//Compares only Objects not the language 
		/**
		for(int i = 0;i<pou1_progLang.size();i++) {
			for(int j = 0;j<pou2_progLang.size();j++) {
				if(pou1_progLang.get(i).equals(pou2_progLang.get(j))) {
					accumulator += 1f;
					break;
				}
			}
		}
		*/
		return accumulator /(Math.max(pou1_progLang.size(),pou2_progLang.size()));
	}
}
