//Write a program to initialize an integer array and print the sum and average of the array.
package com.wipro.Arrays;;
public class A1 {
	public static void main(String[] args) {   
		 
	       int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
	       int sum = 0;
	       for(int i=0; i < numbers.length ; i++)
	        sum = sum + numbers[i];
	        double average = sum / numbers.length;
	        System.out.println("Sum is:"+sum);
	        System.out.println("Average value of the array elements is : " + average); 
	   }
}
