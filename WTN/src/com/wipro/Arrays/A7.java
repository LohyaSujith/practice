
/*Write a program to remove the duplicate elements in an array and print the same.
Example)
I/P:{12,34,12,45,67,89}
O/P:{12,34,45,67,89}*/
package com.wipro.Arrays;
import java.util.Arrays;
public class A7 {
	 public static void main (String[] args) {  
	        int arr[] = {10,20,20,30,30,40,50,50};  
	        int length = arr.length;  
	        length = removeDuplicateElements(arr, length);    
	        for (int i=0; i<length; i++)  
	           System.out.print(arr[i]+" ");  
	    }  
	 public static int removeDuplicateElements(int arr[], int n){  
	        if (n==0 || n==1){  
	            return n;  
	        }  
	        int[] temp = new int[n];  
	        int j = 0;  
	        for (int i=0; i<n-1; i++){  
	            if (arr[i] != arr[i+1]){  
	                temp[j++] = arr[i];  
	            }  
	         }  
	        temp[j++] = arr[n-1];     
	       
	        for (int i=0; i<j; i++){  
	            arr[i] = temp[i];  
	        }  
	        return j;  
	    }  
}