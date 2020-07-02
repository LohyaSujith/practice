package com.wipro.Strings;
import java.util.*;
//import java.io.*;
public class String_2 {
	public static void main(String [] args)
	{
		String s1,s2,concat="";
		Scanner sc=new Scanner(System.in);
		s1=sc.next();
		s2=sc.next();
		concat=s1+s2;
		System.out.println(concat.toLowerCase());
		sc.close();
		
	}

}
