package com.wipro.Strings;
import java.util.*;
public class String_3 {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print(s.substring(0,2));
		}
		sc.close();
	}

}
