/* Write a program to receive a color code from the user (an Alphabhet). 
The program should then print the color name, based on the color code given. 
The following are the color codes and their corresponding color names.
R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White. 
If color code provided by the user is not valid then print "Invalid Code". */
package com.wipro.Loops;
import java.util.Scanner;
public class L8 {
	 public static void main(String args[]){
         int day;
         Scanner SC=new Scanner(System.in);
          
         System.out.print("Enter a weekday number (0 to 6): ");
         day=SC.nextInt();
          
         if(day<0 || day>6){
             System.out.println("Invalid weekday number.");
             System.exit(0);
         }
          
         //print weekday name according to give value
         switch(day){
               case 0: 
                   System.out.println("Sunday");
                   break;
               case 1: 
                   System.out.println("Monday");
                   break;
               case 2: 
                   System.out.println("Tuesday");
                   break;
               case 3: 
                   System.out.println("Wednesday");
                   break;
               case 4: 
                   System.out.println("Thursday");
                   break;
               case 5: 
                   System.out.println("Friday");
                   break;
               case 6: 
                   System.out.println("Saturday");
                   break;                  
               default:
                   System.out.println("Invalid");
                   break;                  
         }
          
     }
}
