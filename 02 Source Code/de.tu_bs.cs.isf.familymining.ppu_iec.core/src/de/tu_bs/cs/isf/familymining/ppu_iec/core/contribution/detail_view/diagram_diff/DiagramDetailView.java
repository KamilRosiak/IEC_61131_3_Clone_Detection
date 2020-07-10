package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.AbstractLanguageContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.ld.DiagramContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.ld.implementation.DiagramElementImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.ld.implementation.LDNetworkImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.string_table.GDVStringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.util.ModelDiff;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.util.NetworkSortUtil;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.parts.detail_view.DetailViewController;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.parts.detail_view.interfaces.IDetailView;
import javafx.embed.swt.FXCanvas;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;

/**
 * 
 * @author Domenik Eichhorn, Eike Schmitz, Ziad Alhajjar
 *
 */
public class DiagramDetailView implements IDetailView {
	public static final String DIFFERENCE_VIEW_TAB_NAME = "Diagram Differences";
	private static final String[] SUPPORTED_CONTAINERS = { name(LDNetworkImplContainer.class),
			/* name(FBDNetworkImplContainer.class), */ name(DiagramElementImplContainer.class),
			/* name(DiagramContainer.class), */ };
	private static final String CSS_GRIDPANE_STYLE = "-fx-background-color: #FFFFFF";
	private Composite root;
	private GridPane sourcePane;
	private GridPane targetPane;

	private static <T> String name(Class<T> classObject) {
		return classObject.getSimpleName();
	}

	@Override
	public void setController(DetailViewController controller) {
	}

	@Override
	public void createControl(Composite root) {
		this.root = root;
		// initialize Panes
		sourcePane = new GridPane();
		targetPane = new GridPane();
	}

	/**
	 * creates layout for the graphical differences tab => only call after the root
	 * has been set, otherwise a NullpointerException can be caused
	 */
	public void createLayout() {
		GridLayout grid = new GridLayout(1, true);
		root.setLayout(grid);
		// create GridData
		GridData layoutData = new GridData();
		layoutData.grabExcessHorizontalSpace = true;
		layoutData.grabExcessVerticalSpace = true;
		layoutData.horizontalAlignment = GridData.FILL;
		layoutData.verticalAlignment = GridData.FILL;
		// create two SWT groups for source and target models
		Group sourceGroup = new Group(root, SWT.NONE);
		sourceGroup.setLayoutData(layoutData);
		sourceGroup.setText(GDVStringTable.SOURCE_GROUP_TEXT);
		sourceGroup.setLayout(new GridLayout(1, true));
		Group targetGroup = new Group(root, SWT.NONE);
		targetGroup.setText(GDVStringTable.TARGET_GROUP_TEXT);
		targetGroup.setLayoutData(layoutData);
		targetGroup.setLayout(new GridLayout(1, true));
		// create JavaFX GridPanes where the diagram elements will be painted
		FXCanvas sourceCanvas = new FXCanvas(sourceGroup, SWT.NONE);
		Scene sourceScene = new Scene(sourcePane);
		sourceCanvas.setScene(sourceScene);
		sourcePane.setStyle(CSS_GRIDPANE_STYLE);
		FXCanvas targetCanvas = new FXCanvas(targetGroup, SWT.NONE);
		Scene targetScene = new Scene(targetPane);
		targetCanvas.setScene(targetScene);
		targetPane.setStyle(CSS_GRIDPANE_STYLE);
		root.layout();
	}

	@Override
	public void showContainer(Object element) {
		Multimap<String, DiagramElement> elementMap = ArrayListMultimap.create();
		Map<DiagramElement, Float> similarityMap = new HashMap<DiagramElement, Float>();
		if (element instanceof LDNetworkImplContainer) {
			LDNetworkImplContainer ldContainer = (LDNetworkImplContainer) element;
			//get source and target network
			EList<DiagramElement> sourceNetwork;
			EList<DiagramElement> targetNetwork;
			//set networks and catch if one container should be empty:
			if (ldContainer.getFirst() != null && ldContainer.getSecond() != null) {
				sourceNetwork = ldContainer.getFirst().getNetworkElements();
				targetNetwork = ldContainer.getSecond().getNetworkElements();
			} else if (ldContainer.getFirst() == null && ldContainer.getSecond() != null) {
				sourceNetwork = new BasicEList<DiagramElement>();
				targetNetwork = ldContainer.getSecond().getNetworkElements();
			} else if (ldContainer.getSecond() == null && ldContainer.getFirst() != null) {
				sourceNetwork = ldContainer.getFirst().getNetworkElements();
				targetNetwork = new BasicEList<DiagramElement>();
			} else {
				sourceNetwork = new BasicEList<DiagramElement>();
				targetNetwork = new BasicEList<DiagramElement>();
			}
			//sort networks
			sourceNetwork = NetworkSortUtil.sortElementsForDiff(sourceNetwork);
			targetNetwork = NetworkSortUtil.sortElementsForDiff(targetNetwork);
			//fill panes:
			for (DiagramElement currentElement : sourceNetwork) {
				elementMap.put(GDVStringTable.SOURCE_KEY, currentElement);
				for(AbstractLanguageContainer<?> container : ldContainer.getImplOption().getAllContainer()) {
					if(container.getFirst() != null) {
						if(currentElement.equals(container.getFirst())) {
							similarityMap.put(currentElement, container.getSimilarity());
							break;
						}
					} else if(container.getSecond() != null) {
						if(currentElement.equals(container.getSecond())) {
							similarityMap.put(currentElement, container.getSimilarity());
							break;
						}
					}
				}
			}
			for (DiagramElement currentElement : targetNetwork) {
				elementMap.put(GDVStringTable.TARGET_KEY, currentElement);
				for(AbstractLanguageContainer<?> container : ldContainer.getImplOption().getAllContainer()) {
					if(container.getFirst() != null) {
						if(currentElement.equals(container.getFirst())) {
							similarityMap.put(currentElement, container.getSimilarity());
							break;
						}
					} else if(container.getSecond() != null) {
						if(currentElement.equals(container.getSecond())) {
							similarityMap.put(currentElement, container.getSimilarity());
							break;
						}
					}
				}
			}
			new ModelDiff().createModelDiff(elementMap, similarityMap, sourcePane, targetPane);
			createLayout();
		} else if (element instanceof DiagramElementImplContainer) {
			DiagramElementImplContainer container = (DiagramElementImplContainer) element;
			elementMap.put(GDVStringTable.SOURCE_KEY, container.getFirst());
			elementMap.put(GDVStringTable.TARGET_KEY, container.getSecond());
			similarityMap.put(container.getFirst(), container.getSimilarity());
			similarityMap.put(container.getSecond(), container.getSimilarity());
			// create Diff and layout
			new ModelDiff().createModelDiff(elementMap, similarityMap, sourcePane, targetPane);
			createLayout();
		}
	}
	
	public void similarityMapper(DiagramElement currentElement) {
		
	}

	@Override
	public <T> boolean isSupportedContainerType(Class<T> elementClass) {
		return Arrays.asList(SUPPORTED_CONTAINERS).contains(elementClass.getSimpleName());
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

}
