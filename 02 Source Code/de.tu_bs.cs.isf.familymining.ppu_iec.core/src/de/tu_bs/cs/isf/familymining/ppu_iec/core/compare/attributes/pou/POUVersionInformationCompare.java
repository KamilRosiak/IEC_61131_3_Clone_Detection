package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.pou;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractPOUAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.Comment;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElementFactory;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class POUVersionInformationCompare extends AbstractPOUAttribute {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2384971302873505L;
	public static final String MODUL_NAME = "Version Number";
	public static final String MODUL_DESCRIPTION = "Compares POUs by their Version Number, if present";

	public static final double weight = 0.7;
	
	
	public static final String METAINFO_VERSION = "Version";
	public static final String METAINFO_STATUS = "Status";
	public static final String METAINFO_COMMENT = "Comment";
	public static final String METAINFO_DATE = "Date";
	public static final String METAINFO_DEVELOPER = "Developer";
	
	public static final String METAINFO_CHANGELOG = "change-log";
	public static final String METAINFO_CHANGELOG_END = "\\change-log";
	public static final String METAINFO_CHANGELOG_DELIMITER = "|";
	
	public static final String VERSION_SEPARATOR = ".";

	public POUVersionInformationCompare() {
		super(MODUL_NAME, MODUL_DESCRIPTION);
	}

	
	@Override
	public ResultElement<POU> compare(POU pou1, POU pou2) {
		
		if(pou1.getIdentifier().equals(pou2.getIdentifier())) {
	
			setVersionInfo(pou1);
			setChangeLogInfo(pou1);
			
			setVersionInfo(pou2);
			setChangeLogInfo(pou2);
			
			String versionNotice = analyzeVersionInfo(pou1,pou2);
			
			if (versionNotice != null) {

				String v1 = "";
				String v2 = "";
				
				for (Comment comment : pou1.getDeclaration().getComment()) {
					if (comment.getIdentifier().equals(METAINFO_VERSION)) {
						v1 = comment.getStatements().get(0);
					}
				}
				
				for (Comment comment : pou2.getDeclaration().getComment()) {
					if (comment.getIdentifier().equals(METAINFO_VERSION)) {
						v2 = comment.getStatements().get(0);
					}
				}
				/**
				if (v1.equals(v2)) {
						System.out.println("Model1: " + pou1.getIdentifier() + " with Model2: "+ pou2.getIdentifier()+" - Both Versions: "+v1);
				}
				else{
					System.out.println("Model1: " + pou1.getIdentifier() + " with Model2: "+ pou2.getIdentifier()+" with "+v1+" & "+v2+" --> "+versionNotice);
				}
								
		}
		else {				
			System.out.println("Model1: " + pou1.getIdentifier() + " with Model2: "+ pou2.getIdentifier()+" - no Version Info");
			**/
		}
	
		}

		return null;
	}
		
	/**
	 * TODO comment
	 * @param source
	 */
	private void setChangeLogInfo(POU pou) {
		
		int changeLogEntities = 0;
		boolean attributeFirst = true;
		
		String changeLogAttributes = "";
		List<String> rawLogs = new ArrayList<>();
		List<List<String>> changeLogData = new ArrayList<>();
		Outerloop:
		for (Comment comment : pou.getDeclaration().getComment()) {

			for (String statement : comment.getStatements()) {
				if (statement.contains(METAINFO_CHANGELOG)) {
				}
				else if (statement.contains(METAINFO_CHANGELOG_DELIMITER) && attributeFirst) {
					changeLogAttributes = statement;
					changeLogEntities = (changeLogAttributes.split("\\"+METAINFO_CHANGELOG_DELIMITER)).length;
					attributeFirst = false;
				}
				else if ((statement.contains(METAINFO_CHANGELOG_DELIMITER) && statement.matches(".*("+METAINFO_CHANGELOG_DELIMITER+".*){"+(changeLogEntities-1)+"}.*"))) {
					
					String[] logEntities = statement.split("\\"+METAINFO_CHANGELOG_DELIMITER);
					rawLogs.add(statement);
					for (int k=0; k<logEntities.length;k++) {
						
						if (logEntities[k].charAt(logEntities[k].length()-1) == ' ') {
							logEntities[k] = (logEntities[k].toString()).substring(0, logEntities[k].length()-1);
						}
						
					}
					
					List<String> lel = new ArrayList<String>(Arrays.asList(logEntities));
					changeLogData.add(lel);
				}
				else if (statement.contains(METAINFO_CHANGELOG_END)) {
					break Outerloop;
				}
			}
		}
		
		// finally create comments
		if (changeLogEntities != 0) {
			Comment comment = LanguageElementFactory.eINSTANCE.createComment();
			comment.setIdentifier(METAINFO_CHANGELOG);
			
			comment.getStatements().add(changeLogAttributes);
			
			comment.getStatements().addAll(rawLogs);
			
			pou.getDeclaration().getComment().add(comment);
			
		}
	}

	/**
	 * TODO comment
	 * @param source
	 */
	private void setVersionInfo(POU pou) {
		
		
		List<String> statements = new ArrayList<>();
		
		for (Comment comment : pou.getDeclaration().getComment()) {
			statements.addAll(comment.getStatements());
			
			// break because already processed
			if (comment.getIdentifier().equals(METAINFO_VERSION)) {
				return;
			}
		}
		
		if (!statements.isEmpty()) {
			for (String statement : statements) {
				if (statement.contains(METAINFO_VERSION)) {
					String versionNumber = getVersionNumber(statement);
					
					if (versionNumber != null && !versionNumber.isEmpty()) {
						
						Comment cm = LanguageElementFactory.eINSTANCE.createComment();
						cm.setIdentifier(METAINFO_VERSION);
						cm.getStatements().add(versionNumber);
						pou.getDeclaration().getComment().add(cm);
					}
				}
			}
		}
		
		
		
	}

	/**
	 * TODO comment
	 * @param statement
	 * @return
	 */
	private String getVersionNumber(String statement) {
		
		int start = -1;
		int end = -1;
		OuterLoop:
		for (int i=0; i<statement.length(); i++) {
			if (Character.isDigit(statement.charAt(i))) {
				if (start == -1) {
					start = i;
				}
				else {
					end = i;
				}
			}
			else if(statement.charAt(i) == METAINFO_CHANGELOG_DELIMITER.charAt(0)) {
				break OuterLoop;
			}
		}	
		
		return (start == -1 || end == -1) ? null : statement.substring(start, end+1);			
		
	}

	/**
	 * TODO comment
	 * @param pair
	 * @return
	 */
	private String analyzeVersionInfo(POU pou1, POU pou2) {
		
		boolean pou1HasVersionInfo = false;
		boolean pou2HasVersionInfo = false;
		
		String pou1version = "";
		String pou2version = "";
		
		for (Comment comment : pou1.getDeclaration().getComment()) {
			if (comment.getIdentifier().equals(METAINFO_VERSION)) {
				pou1HasVersionInfo = true;
				pou1version = comment.getStatements().get(0);
			}
		}
		
		for (Comment comment : pou2.getDeclaration().getComment()) {
			if (comment.getIdentifier().equals(METAINFO_VERSION)) {
				pou2HasVersionInfo = true;
				pou2version = comment.getStatements().get(0);
			}
		}
		
		if (pou1HasVersionInfo && pou2HasVersionInfo) {
			
			String info = "";
			String[] pou1_digits = pou1version.split("\\"+VERSION_SEPARATOR);
			String[] pou2_digits = pou2version.split("\\"+VERSION_SEPARATOR);
			
			if (pou1_digits.length == pou2_digits.length) {
				for (int i=0; i<pou1_digits.length; i++) {
					if (!pou1_digits[i].equals(pou2_digits[i])) {
						if (i == 0) {
							info += "-\t Major Function Change";
						}
						if (i == 1) {
							info += "-\t Minor Function Change";
						}
						if (i == 2) {
							info += "-\t BugFix";
						}
					}
				}
			}
			
			return (info.isEmpty()) ? pou1version : info;
		}
		
		return null;
	}

}