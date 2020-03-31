package com.parser.workspace;

import static org.junit.Assert.*;

import org.junit.Test;
import com.parser.pojo.Number;

public class NumberFormatTest {

	@Test
	public void testisValid()
	{
		NumberFormat n=new NumberFormat();
		
		boolean value=n.isValid("678594847");
		assertEquals(false,value);
		
	}
	
	public void testParseString()
	{
		NumberFormat n=new NumberFormat();
		
		Object object=n.parseString("9876456328");
		assertEquals(new Number("9876456328"),object);
	}
	
	public void testFormatObject()
	{
		NumberFormat n=new NumberFormat();
		
		String str=n.formatObject(new Number("9876456328"));
		assertEquals("9876456328",str);
	}

}
