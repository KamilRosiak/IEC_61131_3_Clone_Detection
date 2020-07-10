package de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.tests.constants.ConstantsTestSuite;

public class MainTestRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(ConstantsTestSuite.class);

	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
	}
}
