//Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
package com.wipro.Arrays;
public class A5 {
	public static void main(String [] args)
	{
		int arr[]= {34,89,96,23,22};
		int max1=arr[1];
		int max2=arr[1];
		int min1=arr[1];
		int min2=arr[1];
		int i;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>max1)
				max1=arr[i];
		}
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>max2 && arr[i]!=max1)
				max2=arr[i];
		}
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]<min1)
			  min1=arr[i];
		}
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]<min2 && arr[i]!=min1)
			  min2=arr[i];
		}
		System.out.println("first largest is"+max1);
		System.out.println("second largest is"+max2);
		System.out.println("first smallest is"+min1);
		System.out.println("second smallest is"+min2);	
	}

}
