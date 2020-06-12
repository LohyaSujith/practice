//Write a program to check if a given number is prime or not.
package com.wipro.Loops;
public class L12 {
public static void main(String [] args)
{
	int n,c=0;
	n=Integer.parseInt(args[0]);
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
			c=1;
			break;
		}
	}
	if(c==0) {
		System.out.println("It is a prime number");
	}
	else
		System.out.println("It is not a prime number");
	
}
}
