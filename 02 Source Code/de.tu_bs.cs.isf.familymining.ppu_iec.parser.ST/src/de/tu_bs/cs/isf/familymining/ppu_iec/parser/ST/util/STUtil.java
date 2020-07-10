package de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util;

public class STUtil {
	
	public static boolean isEqual(String s1, String s2) {
		return s1.equals(s2);
	}
	
	public static String getIllegalRuleMessage(String rule) {
		return "Rule "+rule+" is not supported. ";
	}
}
