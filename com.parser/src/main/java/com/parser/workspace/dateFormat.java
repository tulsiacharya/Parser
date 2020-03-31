package com.parser.workspace;
import java.util.*;
import com.parser.pojo.*;
import com.parser.pojo.Date;
public class dateFormat implements Formatter
{
	
	public Date parseString(String s)
	{
		// TODO Auto-generated method stub
		String []strar=s.split("/",3);
		Date d=new Date(strar[0],strar[1],strar[2]);
		return d;
		
	}

	public String formatObject(Object ob)
	{
		// TODO Auto-generated method stub
		String str=ob.toString();
		return str;
		
	}

	public boolean isValid(String s) {
		// TODO Auto-generated method stub
		String []strar=s.split("/",3);
		int date=Integer.parseInt(strar[0]);
		int month=Integer.parseInt(strar[1]);
		int year=Integer.parseInt(strar[2]);
		char []ch=s.toCharArray();
		try
		{
			for(int i=0;i<s.length();i++)
			{
				if(ch[i]>0 && ch[i]<9)
				{}
				else
				{
					throw new MyError("Error");
				}
			}
			
			if(date>0 && date<31)
			{
				if(month>0 && month<12)
				{
					return true;
				}
				else
				{
					throw new MyError("Error");
				}
			}
			else 
			{
				throw new MyError("Error");
			}
		}
		catch(MyError m)
		{
			
		}
		return true;
	}
	public static void main(String[] args)
	{
		String str=args[0];
		dateFormat df=new dateFormat();
		df.parseString(str);
		Date d=new Date(); 
		df.formatObject(d);
	}

}
