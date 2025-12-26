package com.operators;

public class Digit {

	public static void main(String[] args) {

       int n = -12;
       if (n > -9 && n < 9) {
    	   
    	   System.out.println("The number is single digit");
       }
       else if (n > -99 && n < 99)
       {
    	  System.out.println("The number is double digit"); 
       }
       else {
    	   System.out.println("More than 2 digits");
       }
 
	}

}
