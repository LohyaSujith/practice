/*Write a program to reverse a given number and print

Example1)
I/P: 1234
O/P:4321

Example2)
I/P:1004
O/P:4001*/
package com.wipro.Loops;
public class L17 {
public static void main(String [] args)
{
	int n,rem,rev=0;
	n=Integer.parseInt(args[0]);
	while(n>0)
	{
		rem=n%10;
		rev=(rev*10)+rem;
		n=n/10;
	}
	System.out.println(rev);
}
}
