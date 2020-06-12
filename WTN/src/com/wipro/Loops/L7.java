/* Initialize a character variable with an alphabhet in a program.
If the character value is in lowercase, the output should be displayed in uppercase in the following format.
Example1)
i/p:a
o/p:a->A
If the character value is in uppercase, the output should be displayed in lowercase in the following format.
Example2)
i/p:A
o/p:A-> a*/
package com.wipro.Loops;
public class L7 {
public static void main(String[] args)
{
	char i1='a';
	char i2='A';
	char i3=Character.toUpperCase(i1);
	char i4=Character.toLowerCase(i2);
	  String str1 = "The uppercase of the character '" + i1 + "' is given as: " + i3;  
      String str2 = "The lowercase of the character '" + i2 + "' is given as: " + i4;
      System.out.println(str1);
      System.out.println(str2);  
}
}
