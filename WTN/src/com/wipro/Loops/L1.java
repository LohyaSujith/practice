package com.wipro.Loops;

public class L1 {
	public static void main(String[] args)
	{
		  int x;
          x=Integer.parseInt(args[0]);
          if(x>0) {
        	  System.out.println("Positive");
          }
          else if(x<0) {
        	  System.out.println("Negative");
          }
          else
        	  System.out.println("Zero");   
	}
}
