package de.tu_bs.isf.familymining.ppu_iec.export.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.function.Consumer;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

/**
 * A Utility-Class regarding {@link Menu}- and {@link MenuItem}-Objects.
 * @author Fabian Ochmann
 *
 */
public class MenuUtils {
	
	private MenuUtils() {}
	
	/**
	 * Creates a basic MenuItem, without image.
	 * 
	 * @param menu    The Menu to which the MenuItem should be added
	 * @param text    The Text for the MenuItem
	 * @param onClick The action to perform on click
	 * @return The created MenuItem
	 */
	public static MenuItem createBasicMenuItem(Menu menu, String text, Runnable onClick) {
		MenuItem menuItem = new MenuItem(menu, SWT.NONE);
		menuItem.setText(text);
		menuItem.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				onClick.run();
			}
		});
		return menuItem;
	}
	
	/**
	 * Creates a basic MenuItem, with an image, created from the given resource.
	 * 
	 * @param menu    The Menu to which the MenuItem should be added
	 * @param text    The Text for the MenuItem
	 * @param onClick The action to perform on click
	 * @param image   The File with the image to set on the MenuItem
	 * @return The created MenuItem
	 */
	public static MenuItem createImageMenuItem(Menu menu, String text, Runnable onClick, Image image) {
		MenuItem menuItem = new MenuItem(menu, SWT.NONE);
		menuItem.setImage(image);
		menuItem.setText(text);
		menuItem.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				onClick.run();
			}
		});
		return menuItem;
	}

	/**
	 * Creates a selectable MenuItem.
	 * 
	 * @param menu    The Menu to which the MenuItem should be added
	 * @param text    The Text for the MenuItem
	 * @param onClick The action to perform whenever the selection-status of the
	 *                MenuItem changes
	 * @return The created MenuItem
	 */
	public static MenuItem createCheckBoxMenuItem(Menu menu, String text, boolean isChecked, Consumer<Boolean> onClick) {
		MenuItem menuItem = new MenuItem(menu, SWT.CHECK);
		menuItem.setText(text);
		menuItem.setSelection(isChecked);
		menuItem.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				onClick.accept(menuItem.getSelection());
			}
		});
		return menuItem;
	}
}
