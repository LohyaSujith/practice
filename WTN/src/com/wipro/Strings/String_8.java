package com.wipro.Strings;
import java.util.*;
public class String_8 {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
	System.out.print(str.substring(2,str.length()));
}
	sc.close();
}
}
