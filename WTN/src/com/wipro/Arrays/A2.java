//Write a program to initialize an integer array and find the maximum and minimum value of the array.
package com.wipro.Arrays;
import java.util.Scanner;
public class A2 {
public static void main(String[] args)
{
   int arr[]= {24,30,55,60,90};
   int max=arr[0];
   int min=arr[0];
   for(int i=0;i<arr.length;i++)
   {
	 if(arr[i]>max)
	 {
		 max=arr[i];
	 }
	 if(arr[i]<min)
	 {
		 min=arr[i];
	 }
   }
   System.out.println(max);
   System.out.println(min);
}
}

