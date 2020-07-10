package de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.widgets.Display;

public class ConfigurationManagerColor {
	
	public static Device device = Display.getCurrent ();
	
	public static Color METRIC_CONTAINER_COLOR = new Color (device, 205, 194, 217);
	
	public static Color MODEL_CONTAINER_COLOR = new Color (device, 221 ,215 ,230);
	public static Color MODEL_ATTR_COLOR = new Color (device, 238, 235, 242);
	
	public static Color POU_CONTAINER_COLOR = new Color (device, 183, 222, 232);
	public static Color POU_ATTR_COLOR = new Color (device, 213, 238, 244);
	
	public static Color ACTION_CONTAINER_COLOR = new Color (device, 251, 216, 187);
	public static Color ACTION_ATTR_COLOR = new Color (device, 253, 235, 221);
			
	public static Color LANGUAGE_CONTAINER_COLOR = new Color(device, 230, 185, 181);
	public static Color LANGUAGE_ATTR_COLOR = new Color(device, 242, 220, 218);
	
	public static Color VARIABLE_CONTAINER_COLOR = new Color (device, 216, 228, 192);
	public static Color VARIABLE_ATTR_COLOR = new Color (device, 235, 241, 223);
	
}
