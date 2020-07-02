/*Write a Program to take care of Number Format Exception
 *  if user enters values other than integer for calculating average marks of 2 students. 
 *  The name of the students and marks in 3 subjects are taken from the user while executing the program. 
 *  In the same Program write your own Exception classes to take care of Negative values and values out of range
 *  (i.e. other than in the range of 0-100)
 */

package com.wipro.ExceptionHandling;
import java.util.Scanner;
public class EH3 {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);

	      for(int i = 0; i < 2; ++i) {
	         String name = "";
	         int subA = 0;
	         int subB = 0;
	         int subC = 0;

	         try {
	            name = sc.nextLine();
	            if (!sc.hasNextInt()) {
	               throw new NumberFormatException();
	            }

	            subA = sc.nextInt();
	            if (!sc.hasNextInt()) {
	               throw new NumberFormatException();
	            }

	            subB = sc.nextInt();
	            if (!sc.hasNextInt()) {
	               throw new NumberFormatException();
	            }

	            subC = sc.nextInt();
	            if (subA < 0) {
	            	 System.out.println("NegativeValues Exception occured");
	            }

	            if (subA > 100) {
	            	 System.out.println("ValuesOutOfRange Exception occured");
	            }

	            if (subB < 0) {
	            	 System.out.println("NegativeValues Exception occured");
	            }

	            if (subB > 100) {
	            	System.out.println("ValuesOutOfRange Exception occured");
	            }

	            if (subC < 0) {
	            	 System.out.println("NegativeValues Exception occured");
	            }

	            if (subC > 100) {
	            	System.out.println("ValuesOutOfRange Exception occured");
	            }
	         } catch (ArithmeticException var8) {
	            System.out.println(var8.getMessage());
	         }
	         System.out.println("Name: " + name);
	         System.out.println("Marks of subject A: " + subA);
	         System.out.println("Marks of subject B: " + subB);
	         System.out.println("Marks of subject C: " + subC);
	      }

	      sc.close();
	   }
}
