package de.tu_bs.isf.familymining.ppu_iec.export.components.treebuilders;

import org.eclipse.swt.widgets.TreeItem;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.model.ModelImplementaionOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou.POUCompareContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou.POUVariableOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.templates.IECAbstractOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.variable.VariableContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.VariableDeclaration;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.AbstractContainer;
import de.tu_bs.isf.familymining.ppu_iec.export.components.FMTreeOptionProcessor;
import de.tu_bs.isf.familymining.ppu_iec.export.constants.StringTable;

/**
 * A basic OptionProcessor as used by {@link SelectionFMTreeBuilder} and {@link FamilyModelViewFMTreeBuilder}.
 * As of now Actions are missing because they are not exported.
 * 
 * @author Fabian Ochmann
 *
 */
public class BasicFMTreeProcessor implements FMTreeOptionProcessor {
	
	private BasicFMTreeBuilder treeBuilder;

	public BasicFMTreeProcessor(BasicFMTreeBuilder treeBuilder) {
		this.treeBuilder = treeBuilder;
	}
	
	@Override
	public void processModelImplOption(TreeItem parent, ModelImplementaionOption modelImplOption) {
		for(POUCompareContainer pouContainer : modelImplOption.getAllContainer()) {
			String first =  pouContainer.getLeftLabel();
			String second = pouContainer.getRightLabel();

			TreeItem currentTreeItem = treeBuilder.createTreeItem(pouContainer.getSimilarity(), parent, pouContainer, first, second);
			processPOUContainer(currentTreeItem, pouContainer);
		}
	}
	
	@Override
	public void processOption(TreeItem parent, IECAbstractOption<?> option) {
		if(!option.getAllContainer().isEmpty()) {
			TreeItem varRoot = treeBuilder.createSubsystem(parent, option.getLabel(), null);
			for(AbstractContainer<?, MetricContainer> container : option.getAllContainer()) {
				String first = container.getLeftLabel();
				String second = container.getRightLabel();
				treeBuilder.createTreeItem(container.getSimilarity(), varRoot, container, first, second);
			}
		}	
	}
	
	private void processPOUContainer(TreeItem parent, POUCompareContainer container) {
		if(container.getPouVarOption() != null) {
			processPOUVarOption(parent,container.getPouVarOption());
		}
	}
	
	private void processPOUVarOption(TreeItem parent, POUVariableOption pouVarOption) {
		if(pouVarOption.getAllContainer().size() > 0) {
			TreeItem varRoot = treeBuilder.createSubsystem(parent, pouVarOption.getLabel(), null);
			for(VariableContainer modelVarCont : pouVarOption.getAllContainer()) {
				processVarContainer(varRoot, modelVarCont);
			}
		}
	}
	
	private void processVarContainer(TreeItem parent, VariableContainer varContainer) {
		String first;
		String second;
		VariableDeclaration scope = null;
		//Check for null values 
		first = varContainer.getLeftLabel();
		if(varContainer.getFirst() != null) {
			scope = varContainer.getFirst().getScope();
		}
		if(varContainer.getSecond() != null) {
			scope = varContainer.getSecond().getScope();
		}
		second = varContainer.getRightLabel();

		dispatchBasedOnCategory(varContainer.getSimilarity(), parent, varContainer, first, second, scope);
	}
	
	private void dispatchBasedOnCategory(float similarity, TreeItem varRoot, VariableContainer modelVarCont, String first, String second, VariableDeclaration scope) {
		if (scope.equals(VariableDeclaration.VAR_INPUT)) {
		
			for (TreeItem item : varRoot.getItems()) {
				if (item.getText().equals(StringTable.SUBSYSTEM_VARIABLES_IN)) {
					treeBuilder.createTreeItem(modelVarCont.getSimilarity(), item, modelVarCont, first, second);
					return;
				}
			}
			TreeItem inputVars = treeBuilder.createSubsystem(varRoot, StringTable.SUBSYSTEM_VARIABLES_IN, null);
			treeBuilder.createTreeItem(modelVarCont.getSimilarity(), inputVars, modelVarCont, first, second);
		}
		else if (scope.equals(VariableDeclaration.VAR_OUTPUT)) {
		
			for (TreeItem item : varRoot.getItems()) {
				if (item.getText().equals(StringTable.SUBSYSTEM_VARIABLES_OUT)) {
					treeBuilder.createTreeItem(modelVarCont.getSimilarity(), item, modelVarCont, first, second);
					return;
				}
			}
			TreeItem inputVars = treeBuilder.createSubsystem(varRoot, StringTable.SUBSYSTEM_VARIABLES_OUT, null);
			treeBuilder.createTreeItem(modelVarCont.getSimilarity(), inputVars, modelVarCont, first, second);
		}
		else if (scope.equals(VariableDeclaration.VAR)) {
		
			for (TreeItem item : varRoot.getItems()) {
				if (item.getText().equals(StringTable.SUBSYSTEM_VARIABLES_INTERNAL)) {
					treeBuilder.createTreeItem(modelVarCont.getSimilarity(), item, modelVarCont, first, second);
					return;
				}
			}
			TreeItem inputVars = treeBuilder.createSubsystem(varRoot, StringTable.SUBSYSTEM_VARIABLES_INTERNAL, null);
			treeBuilder.createTreeItem(modelVarCont.getSimilarity(), inputVars, modelVarCont, first, second);
		}
	}
	
}
