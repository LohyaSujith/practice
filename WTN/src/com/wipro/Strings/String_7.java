package com.wipro.Strings;
import java.util.*;
public class String_7 {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		if (str.length() == 0)
		    System.out.print(str);
		  if (str.length() == 1){
		    if (str.charAt(0) == 'x')
		      System.out.print("");
		    else
		    	System.out.print(str);
		  }
		  if (str.charAt(0) == 'x')
		    str = str.substring(1,str.length());
		  if (str.charAt(str.length()-1) == 'x')
		    str = str.substring(0,str.length()-1);
		  System.out.print(str);
		  sc.close();
	}

}
