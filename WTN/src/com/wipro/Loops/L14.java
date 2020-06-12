/*Write a Java program to find if the given number is prime or not.
Example1)
C:\>java Sample 
O/P: Please enter an integer number 
Example2)
C:\>java Sample 1
O/P:1 is neither prime nor composite
Example3)
C:\>java Sample 0
O/P: 0 is neither prime nor composite
Example4)
C:\>java Sample 10
O/P: 10 is not a prime number
Example5)
C:\>java Sample 7
O/P : 7 is a prime number */
package com.wipro.Loops;
public class L14 {
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
		if(n==1) {
			System.out.println("Neither prime nor composite");
		}
		else if(c==0) {
			System.out.println("It is a prime number");
		}
		else
			System.out.println("It is not a prime number");
		
	}
}
