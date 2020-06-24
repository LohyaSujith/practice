package com.wipro.Arrays;
//import java.util.Scanner;
public class A12 {
public static void main(String [] args)
{
	int j=0;
	for(int i=0;i<args.length; i++)
	{
		if((Integer.parseInt(args[i]))!=1&& (Integer.parseInt(args[i]))!=4) {
			System.out.println("false");
			j=1;
		}
	}
	if(j!=1) {
		System.out.println("True");
	}
	
}
}
