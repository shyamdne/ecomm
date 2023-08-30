package com.orders;

public class Lcmcal {

	static int gcd(int a, int b) {

		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	static int lcm(int a, int b) {

		return (a * b) / gcd(a, b);

	}

	public static void main(String[] args) {

		int num1 = 12;
		int num2 = 18;

		int result = lcm(num1, num2);
		System.out.println("LCM OF " + num1 + "AND  " + num2 + " is: " + result);

	}

}
