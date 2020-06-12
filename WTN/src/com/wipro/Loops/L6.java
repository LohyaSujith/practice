package com.wipro.Loops;

public class L6 {
 public static void main(String []args)
 {
	 String gen=args[0];
	int x=Integer.parseInt(args[1]);
    if(gen.equalsIgnoreCase("female"))
    {
    	if(x>=1 && x<=58)
    	{
    		System.out.println("Interest=8.2%");
    	}
    	else if(x>=59 && x<=100)
    	{
    		System.out.println("Interest=9.2%");
    	}
    }
    else
    {
    	if(x>=1 && x<=58)
    	{
    		System.out.println("Interest=8.4%");
    	}
    	else if(x>=59 && x<=100)
    	{
    		System.out.println("Interest=10.5%");
    	}	
    }
 }
}

