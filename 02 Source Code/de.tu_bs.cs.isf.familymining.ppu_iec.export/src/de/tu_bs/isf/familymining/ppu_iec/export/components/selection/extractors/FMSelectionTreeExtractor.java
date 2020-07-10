package de.tu_bs.isf.familymining.ppu_iec.export.components.selection.extractors;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou.POUCompareContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Declaration;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.VariableDeclaration;
import de.tu_bs.isf.familymining.ppu_iec.export.components.selection.FMSelection;
import de.tu_bs.isf.familymining.ppu_iec.export.components.treebuilders.SelectionFMTreeBuilder;
import de.tu_bs.isf.familymining.ppu_iec.export.utils.TreeUtils;

/**
 * An Extractor able to extract a {@link FMSelection}-Instances from a Tree
 * created by a {@link SelectionFMTreeBuilder}. Can be instantiated via
 * {@link FMSelectionExtractors#fromTree()}.
 * 
 * @author Fabian Ochmann
 *
 */
class FMSelectionTreeExtractor implements FMSelectionExtractor<Tree> {

	@Override
	public FMSelection extract(Tree tree) {
		FMSelection selection = new FMSelection();

		// Get all all data from selected items in the tree
		List<TreeItem> selectedItems = TreeUtils.getAllItems(tree).stream().filter(TreeItem::getChecked)
				.filter(item -> item.getData() != null).collect(Collectors.toList());

		// Get all POUs
		List<TreeItem> selectedPouItems = selectedItems.stream().filter(item -> item.getData() instanceof POU)
				.collect(Collectors.toList());

		for (TreeItem item : selectedPouItems) {
			POU pou = (POU) item.getData();
			selection.addPou(pou);

			TreeItem parent = item.getParentItem();
			if (parent != null && parent.getData() != null && parent.getData() instanceof POUCompareContainer) {
				// Add only selected Data
				List<TreeItem> subItems = TreeUtils.getAllChildItems(parent);
				subItems.retainAll(selectedItems);

				// Add variables
				List<Variable> allVariables = subItems.stream().map(TreeItem::getData)
						.filter(Variable.class::isInstance).map(Variable.class::cast).collect(Collectors.toList());
				
				List<Variable> localVariables = allVariables.stream()
						.filter(variable -> variable.getScope().equals(VariableDeclaration.VAR)).collect(Collectors.toList());
				List<Variable> inputVariables = allVariables.stream()
						.filter(variable -> variable.getScope().equals(VariableDeclaration.VAR_INPUT)).collect(Collectors.toList());
				List<Variable> outputVariables = allVariables.stream()
						.filter(variable -> variable.getScope().equals(VariableDeclaration.VAR_OUTPUT)).collect(Collectors.toList());
				
				selection.getLocalVariables(pou).addAll(localVariables);
				selection.getInputVariables(pou).addAll(inputVariables);
				selection.getOutputVariables(pou).addAll(outputVariables);
				
			} else {
				// Optional or uncompared POU -> add all Data

				// Add localVariables
				Declaration declaration = pou.getDeclaration();
				if (declaration != null) {
//					localVariables.addAll(declaration.getInOutVariables());
					selection.getInputVariables(pou).addAll(declaration.getInputVariables());
					selection.getLocalVariables(pou).addAll(declaration.getInternalVariables());
					selection.getOutputVariables(pou).addAll(declaration.getOutputVariables());
				}
				
			}
		}

		// Get all global Variables
		List<Variable> globalVariables = selectedItems.stream().map(TreeItem::getData)
				.filter(Variable.class::isInstance).map(Variable.class::cast)
				.filter(variable -> variable.getScope().equals(VariableDeclaration.VAR_GLOBAL))
				.collect(Collectors.toList());
		selection.getGlobalVariables().addAll(globalVariables);

		return selection;
	}
}
