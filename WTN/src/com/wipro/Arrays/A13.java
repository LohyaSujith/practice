package com.wipro.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class A13 {
	public static void main(String [] args)
	{
		int i,a,b,j;
		Scanner sc=new Scanner(System.in);
		int arr1[]=new int[3];
		int arr2[]=new int[3];
		//int arr3[]=new int[2];
		for(i=0;i<3;i++)
		{
			arr1[i]=sc.nextInt();
		}
		for(j=0;j<3;j++)
		{
			arr2[j]=sc.nextInt();
		}
		int[] arr3= {arr1[1],arr2[1]};
		System.out.println(Arrays.toString(arr3));
		sc.close();
		
	}

}
