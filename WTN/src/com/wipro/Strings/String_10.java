package com.wipro.Strings;
//import java.util.*;
import java.util.regex.*; 
public class String_10 {
	public static void main(String [] args)
	{
		//Scanner sc=new Scanner(System.in);
		StringBuilder s=new StringBuilder("ab*cd");
		Pattern pt = Pattern.compile(".\\*+."); 
		Matcher match = pt.matcher(s);
		String output = match.replaceAll("");
		System.out.println(output);
		//System.out.print(s.substring(0,1)+s.substring(s.length()-1));	
	}

}
