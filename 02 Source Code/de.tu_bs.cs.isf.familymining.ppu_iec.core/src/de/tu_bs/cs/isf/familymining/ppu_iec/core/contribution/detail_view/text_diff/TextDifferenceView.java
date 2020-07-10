package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.text_diff;

import java.util.Arrays;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.st.STLangContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.st.implementation.STImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.DetailViewStrings;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.text_diff.view.DiffText;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.parts.detail_view.DetailViewController;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.parts.detail_view.interfaces.IDetailView;

public class TextDifferenceView implements IDetailView {
	public static final String DIFFERENCE_VIEW_TAB_NAME = "Text Differences";
	private static final String[] SUPPORTED_CONTAINERS = {
			name(STImplContainer.class),
			name(STLangContainer.class),
	};
	

	private DiffText diffText;
	private Table sourceTreeList;
	private Table targetTreeList;
	private DetailViewController controller;
	private Composite root;	

	public TextDifferenceView() {
		this.root = null;
	}

	private String getSourceModelName() {
		//TODO:Fix after refactoring
		return DetailViewStrings.SOURCE_TEXT;
		
	}
	
	private String getTargetModelName() {
		//TODO:Fix after refactoring
		return DetailViewStrings.TARGET_TEXT;
	}
	
	@Override
	public void createControl(Composite parent) {
		this.root = parent;
		root.setLayout(new FillLayout());
		
		Group sourceCode = new Group(root,SWT.NONE);
		sourceCode.setLayout(new GridLayout(1, true));
		sourceCode.setText(getSourceModelName());

		sourceTreeList = new Table(sourceCode, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.WRAP);
		sourceTreeList.setHeaderVisible(false);
	    sourceTreeList.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.FILL_VERTICAL));
//	    sourceTreeList.setBackground(new Color(Display.getCurrent(), 255,255,255));
	    sourceTreeList.setLinesVisible(true);
	    sourceTreeList.getVerticalBar().addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				widgetDefaultSelected(e);
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				targetTreeList.setTopIndex(sourceTreeList.getTopIndex());
			}
	    	
	    });
	    TableColumn col = new TableColumn(sourceTreeList, SWT.NONE);
	    sourceTreeList.addControlListener(new ControlListener() {
			@Override
			public void controlMoved(ControlEvent e) {}

			@Override
			public void controlResized(ControlEvent e) {
				col.setWidth(sourceTreeList.getClientArea().width);
			}
	    	
	    });
	    
		Group targetCode = new Group(root,SWT.NONE);
		targetCode.setLayout(new GridLayout(1, true));
		targetCode.setText(getTargetModelName());
		
		targetTreeList = new Table(targetCode, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.WRAP);
		targetTreeList.setHeaderVisible(false);
	    targetTreeList.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.FILL_VERTICAL));
//	    targetTreeList.setBackground(new Color(Display.getCurrent(), 255,255,255));
	    targetTreeList.setLinesVisible(true);
	    TableColumn column = new TableColumn(targetTreeList, SWT.NONE);
	    targetTreeList.getVerticalBar().addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				widgetDefaultSelected(e);
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				sourceTreeList.setTopIndex(targetTreeList.getTopIndex());
			}
	    	
	    });
	    targetTreeList.addControlListener(new ControlListener() {
			@Override
			public void controlMoved(ControlEvent e) {}

			@Override
			public void controlResized(ControlEvent e) {
				column.setWidth(sourceTreeList.getClientArea().width);
			}
	    	
	    });
	    
	    // initialize text diff
		this.diffText = new DiffText(sourceTreeList, targetTreeList);
	}
	
	private void showDiff(String sourceText, String targetText) {
		diffText.diff(sourceText, targetText);
	}

	@Override
	public <T> boolean isSupportedContainerType(Class<T> containerClass) {
		return Arrays.asList(SUPPORTED_CONTAINERS).contains(containerClass.getSimpleName());
	}

	@Override
	public void showContainer(Object element) {
		if (element instanceof STLangContainer) {
			STLangContainer stLangContainer = (STLangContainer) element;
			String firstText = "";
			String secondText ="";
			
			if(stLangContainer.getFirst() != null ) {
				firstText = stLangContainer.getFirst().getText();
			}
			if(stLangContainer.getSecond() != null) {
				secondText = stLangContainer.getSecond().getText();
			}
			showDiff(firstText, secondText);
		} else if (element instanceof STImplContainer) {
			STImplContainer stImplContainer = (STImplContainer) element;
			String firstText = "";
			String secondText ="";
			
			if(stImplContainer.getFirst() != null ) {
				firstText = stImplContainer.getFirst().getText();
			}
			if(stImplContainer.getSecond() != null) {
				secondText = stImplContainer.getSecond().getText();
			}
			showDiff(firstText, secondText);
		}
	}
	
	private static <T> String name(Class<T> clazz) {
		return clazz.getSimpleName();
	}
	
	@Override
	public String getName() {
		return DIFFERENCE_VIEW_TAB_NAME;
	}

	@Override
	public void dispose() {
		if (root != null && !root.isDisposed()) {
			root.dispose();
		}
	}

	@Override
	public void setController(DetailViewController controller) {
		this.controller = controller;
	}
}
