package de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.tests.expressions;

import static org.junit.Assert.assertNotNull;

import org.antlr.v4.runtime.ParserRuleContext;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.impl.STParser;

public class ExpressionsTest {

ParserRuleContext _context;
	
	@Before
	public void setup() throws Exception {
		_context = null;
	}
	
	@Test
	public void expressionMainTest() {
		_context = (new STParser()).compile( "434.132 + 23123.2", "expression");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( "Var1 * 2", "expression");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( "Var1.A * 2", "expression");
		assertNotNull("Parsing failed", _context);

	}

	@Test
	public void statementTests() {
		_context = (new STParser()).compile( "Var1 := 2", "statement");
		assertNotNull("Parsing failed", _context);	
		
		_context = (new STParser()).compile( 
				"O_TurnClockwise := FALSE;" + 
				"DO_TurnCounterclockwise := FALSE;" + 
				"Stopped := TRUE;" + 
				"TurningClockwise := FALSE;" + 
				"TurningCounterclockwise := FALSE;", "statement_list");
		assertNotNull("Parsing failed", _context);
	}
}
