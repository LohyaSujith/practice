 /*Write a Java program to find if the given number is palindrome or not

Example1)
C:\>java Sample 110011
O/P: 110011 is a palindrome

Example2)
C:\>java Sample 1234
O/P: 1234 is not a palindrome*/


package com.wipro.Loops;
public class L18 {
	public static void main(String [] args)
	{
		int n,rem,rev=0;
		n=Integer.parseInt(args[0]);
		int temp=n;
		while(n>0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(temp==rev)
		{
			System.out.println("PALINDROME");
		}
		else
			System.out.println(" NOT PALINDROME");
	}
}
