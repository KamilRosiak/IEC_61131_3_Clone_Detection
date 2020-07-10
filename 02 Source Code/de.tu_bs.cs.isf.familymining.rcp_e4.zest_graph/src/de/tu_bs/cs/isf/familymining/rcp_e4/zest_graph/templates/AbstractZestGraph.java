package de.tu_bs.cs.isf.familymining.rcp_e4.zest_graph.templates;

import java.util.Collections;

import javax.annotation.PostConstruct;
import org.eclipse.gef.common.adapt.AdapterKey;
import org.eclipse.gef.graph.Graph;
import org.eclipse.gef.mvc.fx.domain.IDomain;
import org.eclipse.gef.mvc.fx.viewer.IViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;
import javafx.application.Application;
import javafx.embed.swt.FXCanvas;
import javafx.scene.Scene;
import javafx.stage.Stage;

public abstract class AbstractZestGraph extends Application {
	private String title;
	protected IDomain domain;
	protected IViewer viewer;
	protected Graph graph;

	private static int id = 0;
	protected static final String ID = ZestProperties.CSS_ID__NE;
	protected static final String LABEL = ZestProperties.LABEL__NE;
	protected static final String CSS_CLASS = ZestProperties.CSS_CLASS__NE;
	protected static final String LAYOUT_IRRELEVANT = ZestProperties.LAYOUT_IRRELEVANT__NE;

	protected static String genId() {
		return Integer.toString(id++);
	}

	public AbstractZestGraph(String title) {
		this.title = title;
	}

	protected abstract Graph createGraph();

	@Override
	public void start(final Stage primaryStage) throws Exception {
		// create graph
		graph = createGraph();

		// configure application
		Injector injector = Guice.createInjector(createModule());
		domain = injector.getInstance(IDomain.class);
		viewer = domain.getAdapter(
				AdapterKey.get(IViewer.class, IDomain.CONTENT_VIEWER_ROLE));
		primaryStage.setScene(createScene(viewer));

		primaryStage.setResizable(true);
		primaryStage.setWidth(getStageWidth());
		primaryStage.setHeight(getStageHeight());
		primaryStage.setTitle(title);
		primaryStage.show();

		// activate domain only after viewers have been hooked
		domain.activate();

		// set contents in the JavaFX application thread because it alters the
		// scene graph
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				viewer.getContents().setAll(Collections.singletonList(graph));
			}
		});
	}

	protected Scene createScene(IViewer viewer) {
		return new Scene(((IViewer) viewer).getCanvas());
	}

	protected int getStageHeight() {
		return 480;
	}

	protected int getStageWidth() {
		return 640;
	}

	protected Module createModule() {
		return new ZestFxModule();
	}

}
