/*  Write a program to print * in Floyds format (using for and while loop)
*
*  *
*  *   *

Example1)
C:\>java Sample 
O/P: Please enter an integer number

Example2)
C:\>java Sample 3
O/P :
*
*  * 
*  *  *  */
package com.wipro.Loops;
public class L16 {
	public static void main(String [] args)
	{
		int n;
		n=Integer.parseInt(args[0]);
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
