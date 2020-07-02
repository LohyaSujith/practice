//program to check palindrome or not.
package com.wipro.Strings;
public class String_1 {
	public static void main(String [] args)
	{
		StringBuffer a=new StringBuffer("malayalam");
		StringBuffer b=a.reverse();
		if(a==b)
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");
	}

}
