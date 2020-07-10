package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.sfc_diff;

import java.util.Arrays;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.AbstractLanguageContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.sfc.SFCLangContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.sfc.implementation.SFCImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.sfc_diff.util.SFCConsts;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.sfc_diff.util.SFCStepFX;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.Step;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.parts.detail_view.DetailViewController;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.parts.detail_view.interfaces.IDetailView;
import javafx.embed.swt.FXCanvas;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;


public class SFCDifferenceView implements IDetailView {
	public static final double distance = 50 ;
	public static final String DIFFERENCE_VIEW_TAB_NAME = "SFC Detail";
	private static final String[] SUPPORTED_CONTAINERS = {
			name(SFCImplContainer.class),
			name(SFCLangContainer.class)
	};

	private Composite parent;
	private SplitPane layout;
	private Pane leftPane;
	private Pane rightPane;
	private double nextX = 10d;
	private double nextY = 20d;
	DetailViewController controller; 
	
	@Override
	public void createControl(Composite root) {
		root.setLayout(new FillLayout());
		FXCanvas canvas = new FXCanvas(root, SWT.None);
		

		leftPane = new Pane();
		rightPane = new Pane();
		layout = new SplitPane(leftPane,rightPane);
		layout.setStyle("-fx-background-color: white;");
		Scene scene = new Scene(layout);
		scene.getStylesheets().add("/css/sfc_theme.css");
		canvas.setScene(scene);
	}

	@Override
	public void showContainer(Object element) {
		//reset positions
		nextX = 10d;
		nextY = 20d;
		if(element instanceof SFCLangContainer) {
			SFCLangContainer sfcLangContainer = (SFCLangContainer)element;
			drawSFC(sfcLangContainer);
		}
		
		if(element instanceof SFCImplContainer) {
			SFCImplContainer sfcImplCont = (SFCImplContainer)element;
			if(sfcImplCont.getFirst() != null) {
				createStep(sfcImplCont.getFirst(), leftPane, SFCConsts.SFC_STEP_STYLE);
			}
			if(sfcImplCont.getSecond() != null) {
				createStep(sfcImplCont.getSecond(), rightPane,SFCConsts.SFC_STEP_STYLE);
			}
		}
	}
	
	private void drawSFC(SFCLangContainer sfcLangContainer) {
		
		for(AbstractLanguageContainer<?> implContainer : sfcLangContainer.getImplOption().getAllContainer()) {
			SFCImplContainer sfcImplContainer = (SFCImplContainer)implContainer;
			if(implContainer.getFirst() != null ) {
				drawStep(sfcImplContainer.getFirst(), leftPane);
			}
			if(implContainer.getSecond() != null) {
				drawStep(sfcImplContainer.getSecond(), rightPane);
			}
			nextY += distance;
		}
	}
	
	private SFCStepFX drawStep(Step step, Pane pane) {
		SFCStepFX fxStep;

		if(step.getInitialStep()) {
			fxStep = createStep(step, pane, SFCConsts.SFC_INIT_STEP_STYLE);
		} else {
			fxStep = createStep(step, pane, SFCConsts.SFC_STEP_STYLE);
		}
		return fxStep;
	}
	
	
	private SFCStepFX createStep(Step step, Pane pane, String style) {
		SFCStepFX fxStep = new SFCStepFX(step.getName());
		fxStep.setTranslateX(nextX);
		fxStep.setTranslateY(nextY);
		Line transition = createTransitions(fxStep);
		pane.getChildren().addAll(fxStep,transition);
		fxStep.setStepStyle(style);
		return fxStep;
	}
	
	private Line createTransitions(SFCStepFX fxStep) {
		Line line = new Line();
		return line;
	}

	@Override
	public <T> boolean isSupportedContainerType(Class<T> containerClass) {
		return Arrays.asList(SUPPORTED_CONTAINERS).contains(containerClass.getSimpleName());
	}

	@Override
	public String getName() {
		return DIFFERENCE_VIEW_TAB_NAME;
	}

	@Override
	public void dispose() {
		if (parent != null && !parent.isDisposed()) {
			parent.dispose();
		}
	}
	
	private static <T> String name(Class<T> clazz) {
		return clazz.getSimpleName();
	}

	@Override
	public void setController(DetailViewController controller) {
		this.controller = controller;
		
	}
}
