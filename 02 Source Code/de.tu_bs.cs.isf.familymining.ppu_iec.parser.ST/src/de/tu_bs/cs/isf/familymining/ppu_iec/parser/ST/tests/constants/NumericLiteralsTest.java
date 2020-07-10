package de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.tests.constants;
import static org.junit.Assert.assertNotNull;

import org.antlr.v4.runtime.ParserRuleContext;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.impl.STParser;

public class NumericLiteralsTest {
	
	ParserRuleContext _context;
	
	@Before
	public void PreSetup() {
		_context = null;
	}
	
	@Test
	public void integerLiteralsTest() {		
		// INT_TYPE_NAME#SIGNED_INT
		_context = (new STParser()).compile( "INT#2_23_232", "integer_literal");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( "DINT#-2_23_232", "integer_literal");
		assertNotNull("Parsing failed", _context);
		
		// INT_TYPE_NAME#BINARY_INT
		_context = (new STParser()).compile( "DINT#2#0011_11001_0101", "integer_literal");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( "ULINT#2#001010101", "integer_literal");
		assertNotNull("Parsing failed", _context);
		
		// INT_TYPE_NAME#BINARY_HEX
		_context = (new STParser()).compile( "LINT#16#ABF29A", "integer_literal");
		assertNotNull("Parsing failed", _context);
		
		// INT_TYPE_NAME#BINARY_OCT
		_context = (new STParser()).compile( "SINT#8#23670", "integer_literal");
		assertNotNull("Parsing failed", _context);
	}

	@Test
	public void realLiteralsTest() {
		
		// plain real
		_context = (new STParser()).compile( "9129332.34324233", "real_literal");
		assertNotNull("Parsing failed", _context);
		
		// real_type + negative real
		_context = (new STParser()).compile( "REAL#-23432.323", "real_literal");
		assertNotNull("Parsing failed", _context);
		
		// real_type + positive real
		_context = (new STParser()).compile( "LREAL#+53345.132", "real_literal");
		assertNotNull("Parsing failed", _context);
		
		// real_type + positive real with negative exponent
		_context = (new STParser()).compile( "LREAL#+9932.3233e-32", "real_literal");
		assertNotNull("Parsing failed", _context);
		
		// real_type + positive real with positive exponent
		_context = (new STParser()).compile( "LREAL#+9932.3233e+98", "real_literal");
		assertNotNull("Parsing failed", _context);
	}
}
