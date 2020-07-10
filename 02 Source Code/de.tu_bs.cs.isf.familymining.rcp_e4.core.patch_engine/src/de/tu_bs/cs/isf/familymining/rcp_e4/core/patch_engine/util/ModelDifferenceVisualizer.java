package de.tu_bs.cs.isf.familymining.rcp_e4.core.patch_engine.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.diffmerge.api.IMatch;
import org.eclipse.emf.diffmerge.api.Role;
import org.eclipse.emf.diffmerge.api.diff.IAttributeValuePresence;
import org.eclipse.emf.diffmerge.api.diff.IDifference;
import org.eclipse.emf.diffmerge.api.diff.IElementPresence;
import org.eclipse.emf.diffmerge.api.diff.IReferenceValuePresence;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.graphics.Color;

import de.tu_bs.cs.isf.familymining.rcp_e4.core.patch_engine.IMappingNode;

public class ModelDifferenceVisualizer {
	
	private List<StyleRange> styleRanges;
	private String referenceModelName;
	private String targetModelName;
	private StringBuilder sb;
	private Set<String> comparedFeatureNames;
	private IMappingNode rootNode;
	
	public ModelDifferenceVisualizer(String referenceModelName, String targetModelName) {
		this.styleRanges = new ArrayList<>();
		this.comparedFeatureNames = new HashSet<>(); 
		this.sb = new StringBuilder();
		this.referenceModelName = referenceModelName;
		this.targetModelName = targetModelName;
		this.rootNode = null;
	}
	
	public String buildModelDifference(IMappingNode node) {
		rootNode = node;
		if (rootNode == null) {
			return "<matching node is null>";
		}
		
		buildHeader(); 
		sb.append("\n\n");
		
		buildMatches(node);
		sb.append("\n");
		
		return sb.toString();
	}
	
	public List<StyleRange> getStyleRanges() {
		return styleRanges;
	}
	
	protected void buildHeader() {
		sb.append("Model Differences between \""+referenceModelName+"\" and \""+targetModelName+"\".");
		
		storeLocalizedStyle(referenceModelName, null, SWT.BOLD);
		storeLocalizedStyle(targetModelName, null, SWT.BOLD);
		
	}
	
	protected void buildMatches(IMappingNode node) {
		for (IMatch match : node.getIntrinsicComparison().getMapping().getContents()) {
			comparedFeatureNames.clear();
			buildMatchHeader(match);
			sb.append("\n");
			for (IDifference diff : match.getAllDifferences()) {
				buildDifferenceInfo(diff);
			}
			sb.append("\n");
		}
		
		// repeat for children 
		for (IMappingNode child : node.getChildren()) {
			buildMatches(child);
		}
	}
	
	protected void buildMatchHeader(IMatch match) {
		String matchId = match.getMatchID() != null? match.getMatchID().toString() : "";
		matchId = "\""+matchId+"\"";
		
		String refMatchPartner = rootNode.getName(match.get(Role.REFERENCE));
		if (refMatchPartner == null) {
			refMatchPartner = "<no reference object>";
		}
		String targetMatchPartner = rootNode.getName(match.get(Role.TARGET));
		if (targetMatchPartner == null) {
			targetMatchPartner = "<no target object>";
		}
		
		if (match.get(Role.REFERENCE) == null || match.get(Role.TARGET) == null) {
			sb.append("Incomplete match:\n");
			storeLocalizedStyle("Incomplete match:", null, SWT.BOLD);
		} else {
			sb.append("Match with id "+matchId+":\n");
			storeLocalizedStyle("Match", null, SWT.BOLD);
			storeLocalizedStyle(matchId, null, SWT.ITALIC);
		}
		sb.append("Reference element("+refMatchPartner+")\n");
		storeLocalizedStyle("Reference", null, SWT.ITALIC);
		storeLocalizedStyle(refMatchPartner, null, SWT.BOLD);

		sb.append("Target element("+targetMatchPartner+")\n");
		storeLocalizedStyle("Target", null, SWT.ITALIC);
		storeLocalizedStyle(targetMatchPartner, null, SWT.BOLD);
		
		sb.append("\tDifferences:");
		storeLocalizedStyle("Differences", null, SWT.BOLD);
	}
	
	protected void buildDifferenceInfo(IDifference diff) {		
		if (diff instanceof IAttributeValuePresence) {
			showAttributeDiff((IAttributeValuePresence) diff, comparedFeatureNames);
		} else if (diff instanceof IReferenceValuePresence) {
			showReferenceDiff((IReferenceValuePresence) diff, comparedFeatureNames);
		} else if (diff instanceof IElementPresence) {
			showElementDiff((IElementPresence) diff, comparedFeatureNames);
		}
	}
	
	private void showElementDiff(IElementPresence diff, Set<String> comparedFeatureNames) {
		sb.append("\t > Element diff: [");
		String elementString = diff.getElement().getClass().getSimpleName();
		sb.append("new element: "+elementString+"] added to the (" + diff.getPresenceRole() + ")\n" );
	}

	private void showAttributeDiff(IAttributeValuePresence diff, Set<String> comparedFeatureNames) {
		String attrValue = diff.getValue().toString();
		String featureName = diff.getFeature().getName();
		if (!comparedFeatureNames.contains(featureName)) {
			comparedFeatureNames.add(featureName);
			String symmAttrValue = diff.getSymmetrical().getValue().toString();
			String symmFeatureName = diff.getSymmetrical().getFeature().getName();
			sb.append("\t > Attribute diff: [");
			sb.append("Attribute value: "+oneLineTeaser(attrValue)+", with feature name: "+featureName+
					" in the SOURCE changed to attribute value: "+oneLineTeaser(symmAttrValue)+", with feature name: "+symmFeatureName+"] at the TARGET\n");		
		}
	}
	
	private void showReferenceDiff(IReferenceValuePresence diff, Set<String> comparedFeatureNames) {
		String featureName = diff.getFeature().getName();
		if (!comparedFeatureNames.contains(featureName)) {
			comparedFeatureNames.add(featureName);
			String refClassName = diff.getFeature().getEReferenceType().getName();
			sb.append("\t > Reference diff("+diff.getPresenceRole()+"): [ unmatched presence of reference value with ");
			sb.append("featureName: "+featureName+", refClassName: "+refClassName+"]\n");
		}
	}
	
	private void storeLocalizedStyle(String uniqueString, Color letterColor, int fontStyle) {
		storeLocalizedStyle(uniqueString, letterColor, fontStyle, sb.length());
	}
	
	private void storeLocalizedStyle(String uniqueString, Color letterColor, int fontStyle, int fromIndex) {
		int startIndex = sb.lastIndexOf(uniqueString, fromIndex);
		int length = uniqueString.length();
		if (startIndex != -1 && startIndex+length <= sb.length()) {
			styleRanges.add(new StyleRange(startIndex, length, letterColor, null, fontStyle));			
		}
	}
	
	private String oneLineTeaser(String text) {
		int lineBreakIndex = text.indexOf("\n");
		if (lineBreakIndex != -1) {
			String oneLiner = text.substring(0, lineBreakIndex);
			return oneLiner + " ...";
		} else {
			return text;
		}
	}
}
