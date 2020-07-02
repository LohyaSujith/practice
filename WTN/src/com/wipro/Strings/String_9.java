package com.wipro.Strings;
import java.util.*;
public class String_9 {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	String str1,str2;
	str1=sc.next();
	str2=sc.next();
	for(int i=0;i<str1.length() || i<str2.length();i++)
	{
		if(i<str1.length())
			System.out.print(str1.charAt(i));
		if(i<str2.length())
			System.out.print(str2.charAt(i));
			
	}
	sc.close();
}
}
