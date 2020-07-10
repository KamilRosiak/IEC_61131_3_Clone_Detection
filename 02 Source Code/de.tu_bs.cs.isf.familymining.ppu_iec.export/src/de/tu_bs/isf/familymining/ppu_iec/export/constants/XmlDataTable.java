package de.tu_bs.isf.familymining.ppu_iec.export.constants;

import java.math.BigDecimal;

public class XmlDataTable {

	//file header
	public final static String COMPANY_NAME = "Beckhoff Automation GmbH";
	public final static String PRODUCT_NAME = "TwinCAT PLC Control";
	public final static String PRODUCT_VERSION = "3.5.8.40";
		
	//coordinate info
	public final static BigDecimal FBD_X = new BigDecimal(1);
	public final static BigDecimal FBD_Y = new BigDecimal(1);
	public final static BigDecimal LD_X = new BigDecimal(1);
	public final static BigDecimal LD_Y = new BigDecimal(1);
	public final static BigDecimal SFC_X = new BigDecimal(1);
	public final static BigDecimal SFC_Y = new BigDecimal(1);
	
	//handle unknown
	public final static String HANDLE_UNKNOWN_IMPLEMENTATION = "implementation";

	
	//data
	public final static String PROJECT_INFORMATION_DATA = "http://www.3s-software.com/plcopenxml/projectinformation";
	public final static String APPLICATION_DATA = "http://www.3s-software.com/plcopenxml/application";
	public final static String POU_DATA = "http://www.3s-software.com/plcopenxml/pou";

	
	
}
