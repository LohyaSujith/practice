package com.wipro.Strings;
import java.util.*;
public class String_4 {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	int slen=s.length();
	if(slen%2==0)
	{
		System.out.print(s.substring(0,slen/2));
	}
	else
		System.out.print("Null");
	sc.close();
	}
}
