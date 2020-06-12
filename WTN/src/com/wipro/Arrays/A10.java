
/*Write a program to find the biggest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.


Example1:
C:\>java Sample 1 2 3
O/P: Please enter 9 integer numbers

Example2:
C:\>java Sample 1 23 45 55 121 222 56 77 89
O/P: 
The given array is :
1 23 45 
55 121 222 
56 77 89 
The biggest number in the given array is 222 */
package com.wipro.Arrays;

public class A10 {

	public static void main(String args[])
    {
    int n=args.length;
    int i,j;
    int max=Integer.parseInt(args[0]);
    if(n<9 || n>9)
    {
    	System.out.println("enter 9 integer numbers");
    }
    else if(n==9)
    {
    	 int arr[][]=new int[30][30];
    	 int k=0;
    	for(i=0;i<3;i++)
    	{
    		for(j=0;j<3;j++)
    		{
    			arr[i][j]=Integer.parseInt(args[k]);
    			k++;
    			System.out.print(arr[i][j]+" ");
    			if(arr[i][j]>max)
    				max=arr[i][j];
    		}
    		System.out.println();  		
    	}
    	System.out.println(max);

    	   	
    }
   
    }
}
