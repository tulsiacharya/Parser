package com.parser.workspace;

public interface Formatter
{
	Object parseString(String s);
	String formatObject( Object ob);
	boolean isValid( String s);
}
