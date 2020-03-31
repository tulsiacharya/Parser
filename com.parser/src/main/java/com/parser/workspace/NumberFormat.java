package com.parser.workspace;
import com.parser.pojo.*;
import com.parser.pojo.Number;
public class NumberFormat implements Formatter
{
	
	public Object parseString(String s) {
		// TODO Auto-generated method stub
		Number n=new Number(s);
		return n;
		
	}

	public String formatObject(Object ob) {
		// TODO Auto-generated method stub
		String str=ob.toString();
		return str;
		
	}

	public boolean isValid(String s) {
		// TODO Auto-generated method stub
		char []ch=s.toCharArray();
		int count=0;
		try {
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]>=0 && ch[i]<=9)
			{
				count++;
			}
			else
			{
				throw new MyError("Error");
			}
		}
		}
		catch(MyError e)
		{
			
		}
		if(count==10)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public static void main(String[] args)
	{
		String s= args[0];
		
		
	}

}
