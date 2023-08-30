package com.orders;

public class GcdExample {

	static int gcd(int a, int b) {
		if( b==0) {
			
			return a;
			
		}
		
		return gcd(b, a%b);
			
	}

	
	
	public static void main(String[] args) {
		
		int num1 = 12;
		int num2 = 18;
		
		int result = gcd(num1,num2);
		System.out.println("GCP Of "+ num1 + " and " + num2 + " is: " +result);
		
		
	}
}
