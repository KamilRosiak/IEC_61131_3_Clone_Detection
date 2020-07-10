package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.model_diff;

import org.eclipse.swt.widgets.Composite;

import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.parts.detail_view.DetailViewController;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.parts.detail_view.interfaces.IDetailView;


public class ModelDifferenceView implements IDetailView {
	public static final String MODEL_DIFFERENCE_VIEW_TAB_NAME = "Model Differences";
	private static final String[] SUPPORTED_CONTAINERS = {
//			name(STImplContainer.class),
//			name(STLangContainer.class)
//			name(SFCImplContainer.class),
//			name(SFCLangContainer.class),
//			name(LDImplContainer.class),
//			name(LDLangContainer.class)
	};
	private DetailViewController controller;
	//TODO: Fix ME dependency fix  
	/**
	private DetailViewController controller;
	private StyledText textField;
	private Button button;
	private ModelDifferenceVisualizer diffVisualizer;
	private PatchSelectionListener patchButtonListener;
	
	public ModelDifferenceView(DetailViewController controller) {
		this.controller = controller;
		this.diffVisualizer = null;
		this.patchButtonListener = new PatchSelectionListener(controller);
	}
	
	@Override
	public void createControl(Composite root) {
		root.setLayout(new GridLayout(10, true));

		button = new Button(root, SWT.PUSH);
		button.setText("Create Patch");
		button.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, true, 1, 1));
		if (!button.isListening(SWT.Selection)) {
			button.addSelectionListener(patchButtonListener);			
		}
		
		textField = new StyledText(root,SWT.READ_ONLY | SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
		textField.setBackground(null);
		textField.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 9, 1));

	}

	@Override
	public void showContainer(Object element) {
		if(element instanceof IECAbstractContainer<?>) {
			IECAbstractContainer<?> container = (IECAbstractContainer<?>)element;
			// set the behaviour for the current container
			patchButtonListener.setContainer(container);
			
			// compute diff on container
			IPatchEngine patchEngine = new DefaultPatchEngine(new IECComparator());
			IMappingNode rootMatching = patchEngine.diff(container);
			
			// compute textual representation of changes
			diffVisualizer = new ModelDifferenceVisualizer(getReferenceModelName(), getTargetModelName());
			String diffTextOutput = diffVisualizer.buildModelDifference(rootMatching);
			
			// show changes in text field
			// apply styles
			textField.append(diffTextOutput);		
			diffVisualizer.getStyleRanges().forEach(styleRange -> textField.setStyleRange(styleRange));
		}
	}

	@Override
	public <T> boolean isSupportedContainerType(Class<T> containerClass) {
		String className = containerClass.getSimpleName();
		return Arrays.asList(SUPPORTED_CONTAINERS).contains(className);
	}

	@Override
	public String getName() {
		return MODEL_DIFFERENCE_VIEW_TAB_NAME;
	}

	@Override
	public void dispose() {
		
	}
	
	private String getReferenceModelName() {
		return StringTable.SOURCE_TEXT;
		
	}
	
	private String getTargetModelName() {
		return StringTable.TARGET_TEXT;
		
	}
	
	private static <T> String name(Class<T> clazz) {
		return clazz.getSimpleName();
	}
	**/
	@Override
	public void createControl(Composite root) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void showContainer(Object element) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public <T> boolean isSupportedContainerType(Class<T> elementClass) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setController(DetailViewController controller) {
		this.controller = controller;
		
	}
}
