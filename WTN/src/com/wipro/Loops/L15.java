 /*Write a program to print the sum of all the digits of a given number.
Example1) 
I/P:1234
O/P:10*/

package com.wipro.Loops;
public class L15 {
	public static void main(String [] args)
	{
		int n,rem,sum=0;
		n=Integer.parseInt(args[0]);
		int temp=n;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);
	}

}
