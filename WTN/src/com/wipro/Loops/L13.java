//Write a program to print prime numbers between 10 and 99.
package com.wipro.Loops;
public class L13 {
public static void main(String[] args)
{
	int a,b,c=0,i,j;
	a=Integer.parseInt(args[0]);
	b=Integer.parseInt(args[1]);
	for(i=a;i<=b;i++)
	{
		c=0;
		for(j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				c=c+1;
			}
		}
		if(c==2)
		{
			System.out.println(i);
		}
			
	}
}
}
