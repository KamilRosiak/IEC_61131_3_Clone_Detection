package de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.tests.constants;

import static org.junit.Assert.assertNotNull;

import org.antlr.v4.runtime.ParserRuleContext;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.impl.STParser;

public class TimeLiteralsTest {

	ParserRuleContext _context;
	
	@Before
	public void setup() throws Exception {
		_context = null;
	}
	
	@Test
	public void durationLiteralsTest() {
		_context = (new STParser()).compile( "T#-23.23d", "time_literal");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( "TIME#23d_123.42h", "time_literal");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( "TIME#-423d34h334.23m", "time_literal");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( "TIME#534d_62h_334.23m_4324.242s", "time_literal");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( "T#534d_62h_334m_4324s_4324.3ms", "time_literal");
		assertNotNull("Parsing failed", _context);
	}
	
	@Test
	public void timeOfDayTest() {
		_context = (new STParser()).compile( "TIME_OF_DAY#13:30:13.4", "time_literal");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( "TOD#23:53:20.4", "time_literal");
		assertNotNull("Parsing failed", _context);
	}
	
	@Test
	public void dateLiteralsTest() {
		_context = (new STParser()).compile( "DATE#2018-03-21", "time_literal");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( "D#1996-05-31", "time_literal");
		assertNotNull("Parsing failed", _context);
	}
	
	@Test
	public void dateAndTimeLiteralsTest() {
		_context = (new STParser()).compile( "DATE_AND_TIME#2018-03-21-22:00:12.2", "time_literal");
		assertNotNull("Parsing failed", _context);
		
		_context = (new STParser()).compile( "DT#2033-04-30-08:02:12.2", "time_literal");
		assertNotNull("Parsing failed", _context);
	}
}
