//Write a program to print first 5 values which are divisible by 2, 3, and 5.
package com.wipro.Loops;
public class L19 {
public static void main(String [] args)
{
	int n=0,i=1;
	//n=Integer.parseInt(args[0]);
	while(n<5)
	{
		if(i%2==0 && i%3==0 && i%5==0)
		{
			System.out.print(i+" ");
			n++;
		}
		i++;
	}
}
}
