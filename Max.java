package com.operators;

public class Max {
	
	public static void main(String [] args) {
		
		int a=30 ,b=20;
		if(a>b)
		{
			System.out.println(" a is  greater " +a);
		}
		else {
			System.out.println("b is greater" +b);
		}
		//using ternary operator
		int max= (a > b) ? a : b;
       System.out.println("Maximum between numbers is : " +max);
	}
	
	
}
