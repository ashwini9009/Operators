package com.operators;

public class Divisibility {

	public static void main(String[] args) {
		int n =55;
		if(n % 5==0 && n%11==0) {
			System.out.println("Number is divisible by 5 and 11: "+n);
		}
		else {
			System.out.println("Number is not divisible by 5 and 11: "+n);
		}
	}

}
