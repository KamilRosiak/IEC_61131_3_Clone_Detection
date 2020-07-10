package de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.tests.constants;

import static org.junit.Assert.assertNotNull;

import org.antlr.v4.runtime.ParserRuleContext;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.impl.STParser;

public class BitStringAndBoolTest {

	ParserRuleContext _context;
	STParser _parser;
	
	@Before
	public void setup() throws Exception {
		_context = null;
		_parser = new STParser();
	}
	
	@Test
	public void bitStringTest() {
		_context = (new STParser()).compile( "BYTE#2#0101010", "bit_string");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( "WORD#123", "bit_string");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( "DWORD#8#05377", "bit_string");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( "LWORD#16#143FA23C", "bit_string");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( "21334", "bit_string");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( "8#2323", "bit_string");
		assertNotNull("Parsing failed", _context);
	}
	
	@Test
	public void booleanLiteralsTest() {
		_context = (new STParser()).compile( "1", "boolean_literal");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( "0", "boolean_literal");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( "BOOL#1", "boolean_literal");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( "TRUE", "boolean_literal");
		assertNotNull("Parsing failed", _context);
	}
}
