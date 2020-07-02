package com.wipro.Strings;
import java.util.*;
public class String_6 {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1,s2;
		s1=sc.next();
		s2=sc.next();
		int s1len=s1.length();
		int s2len=s2.length();
		if(s1len==0)
		{
			System.out.println(s2);
		}
		if(s2len==0)
		{
			System.out.println(s1);
		}
		if(s1len>s2len)
		{
			System.out.println(s2+s1+s2);
		}
		else
			System.out.println(s1+s2+s1);
		sc.close();
	}

}
