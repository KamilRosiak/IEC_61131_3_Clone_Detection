package de.tu_bs.cs.isf.familymining.ppu_iec.core.util;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUStringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Resource;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElement;


/**
 * This class counts the LanguageElements out of a configuration model.
 * @author {Kamil Rosiak}
 *
 */
public class LanguagePreprocessors {
	private boolean isFBD = false;
	private boolean isIL = false;
	private boolean isLD = false;
	private boolean isSFC = false;
	private boolean isST = false;
	
	public LanguagePreprocessors(Configuration conf) {
		processPOU(conf);
	}
	
	public LanguagePreprocessors(List<Configuration> conf) {
		for(Configuration c: conf) {
			processPOU(c);
		}
	}
	
	private void processPOU(Configuration conf) {
		EList<Resource> resource = conf.getResources();
		for(Resource r : resource) {
			for(POU pou : r.getPous()) {
				for(LanguageElement l :pou.getImplementations()) {
					if(l.getLabel().equals(PPUStringTable.FBD)) {
						setFBD(true);
					} else if(l.getLabel().equals(PPUStringTable.IL)) {
						setIL(true);
					} else if(l.getLabel().equals(PPUStringTable.LD)) {
						setLD(true);
					} else if(l.getLabel().equals(PPUStringTable.SFC)) {
						setSFC(true);
					} else if(l.getLabel().equals(PPUStringTable.ST)) {
						setST(true);
					}
				}
			}	
		}	
	}

	//getter and setter for the boolean operations
	public boolean isFBD() {
		return isFBD;
	}
	public void setFBD(boolean isFBD) {
		this.isFBD = isFBD;
	}
	public boolean isIL() {
		return isIL;
	}
	public void setIL(boolean isIL) {
		this.isIL = isIL;
	}
	public boolean isLD() {
		return isLD;
	}
	public void setLD(boolean isLD) {
		this.isLD = isLD;
	}
	public boolean isSFC() {
		return isSFC;
	}
	public void setSFC(boolean isSFC) {
		this.isSFC = isSFC;
	}
	public boolean isST() {
		return isST;
	}
	public void setST(boolean isST) {
		this.isST = isST;
	}
}
