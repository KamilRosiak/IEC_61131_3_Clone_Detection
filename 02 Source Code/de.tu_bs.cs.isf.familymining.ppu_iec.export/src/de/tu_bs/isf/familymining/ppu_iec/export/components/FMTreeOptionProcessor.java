package de.tu_bs.isf.familymining.ppu_iec.export.components;

import org.eclipse.swt.widgets.TreeItem;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.model.ModelImplementaionOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.templates.IECAbstractOption;

public interface FMTreeOptionProcessor {

	void processModelImplOption(TreeItem parent, ModelImplementaionOption modelImplOption);

	void processOption(TreeItem parent, IECAbstractOption<?> option);

}