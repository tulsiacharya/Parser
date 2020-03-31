package com.parser.workspace;

import static org.junit.Assert.*;

import org.junit.Test;

import com.parser.pojo.Number;

public class SSNFormatTest {

	@Test
	public void testisValid()
	{
		SSNFormat s=new SSNFormat();
		
		boolean value=s.isValid("678594847232");
		assertEquals(false,value);
		
	}
	
	public void testParseString()
	{
		SSNFormat s=new SSNFormat();
		
		Object object=s.parseString("987645632878");
		assertEquals(new Number("987645632878"),object);
	}
	
	public void testFormatObject()
	{
		SSNFormat s=new SSNFormat();
		
		String str=s.formatObject(new Number("9876456328"));
		assertEquals("9876456328",str);
	}
	
}
