/*Write a class MathOperation which accepts integers from command line. 
 * Create an array using these parameters. Loop through the array and obtain the sum and average of all the 
 * elements. Display the result. Check for various exceptions that may arise like 
 * ArithmeticException, NumberFormatException, and so on. For example: 
 */
package com.wipro.ExceptionHandling;
import java.util.InputMismatchException;
public class EH2 {
	 public static void main(String[] args) {
	      int n = args.length;

	      for(int i = 0; i < n; ++i) {
	         if (args[i].charAt(args[i].length() - 1) == ',') {
	            args[i] = args[i].replace(",", "");
	         }
	      }

	      int[] arr = new int[n];
	      int sum = 0;
	      double avg = 0.0D;

	      try {
	         int i;
	         for(i = 0; i < n; ++i) {
	            arr[i] = Integer.parseInt(args[i]);
	         }

	         for(i = 0; i < n; ++i) {
	            sum += arr[i];
	         }

	         avg = (double)(sum / n);
	      } catch (NumberFormatException var7) {
	         System.out.println("NumberFormatException");
	      } catch (ArithmeticException var8) {
	         System.out.println("ArithmeticException");
	      } catch (InputMismatchException var9) {
	         System.out.println("InputMismatchException");
	      }

	      System.out.println("sum: " + sum);
	      System.out.println("avg: " + avg);
	   }

}
