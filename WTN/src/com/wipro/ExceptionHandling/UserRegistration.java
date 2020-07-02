package com.wipro.ExceptionHandling;
public class UserRegistration {
public void registerUser(String username, String userCountry) throws Exception {
	      if (!userCountry.equals("India")) {
	         System.out.println("Invalid country Exception");
	      } else {
	         System.out.println("User registration done successfully");
	      }
	   }
public static void main(String[] args) {
	      UserRegistration registration = new UserRegistration();
	      try {
	         registration.registerUser("Mickey", "US");
	      } catch (Exception e) {
	    	  System.out.println(e);
	      }

	   }
}
