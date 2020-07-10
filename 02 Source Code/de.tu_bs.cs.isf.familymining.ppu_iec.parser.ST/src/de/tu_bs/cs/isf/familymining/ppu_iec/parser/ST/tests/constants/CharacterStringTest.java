package de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.tests.constants;

import static org.junit.Assert.assertNotNull;

import org.antlr.v4.runtime.ParserRuleContext;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.impl.STParser;

public class CharacterStringTest {

	ParserRuleContext _context;
	
	@Before
	public void setup() throws Exception {
		_context = null;
	}

	@Test
	void singleByteCharTest() {
		
		_context = (new STParser()).compile( " '$\'' ", "character_string");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( "'\"'", "character_string");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( "'$BA'", "character_string");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( " '+' ", "character_string");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( " '-' ", "character_string");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( " '%' ", "character_string");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( " '(' ", "character_string");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( " ')' ", "character_string");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( " '$$' ", "character_string");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( " '$L' ", "character_string");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( " '$p' ", "character_string");
		assertNotNull("Parsing failed", _context);
	}
	
	@Test
	public void doubleByteCharTest() {
		_context = (new STParser()).compile( " \"$\"\" ", "character_string");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( " \"'\" ", "character_string");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( " \"$BACF\" ", "character_string");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( " \"$03FA\" ", "character_string");
		assertNotNull("Parsing failed", _context);
	}

}
