package com.parser.workspace;

import static org.junit.Assert.*;

import org.junit.Test;

import com.parser.pojo.Date;

public class dateFormatTest {

	@Test
	public void testFormatObject()
	{
		dateFormat d=new dateFormat();
		
	
		String str=d.formatObject(new Date("12","10","2020"));
		assertEquals(12/10/2020, str);
	}
	public void testIsValid()
	{
		dateFormat d=new dateFormat();
		
		boolean value=d.isValid("12/10/2020");
		assertEquals(true,value);
	}
	
	public void testParseString()
	{
		dateFormat d=new dateFormat();
		
		Object object=d.parseString("12/11/2020");
		assertEquals(new Date("12","10","2020"),object);

	}

}
