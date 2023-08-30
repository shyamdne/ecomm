package com.orders;

public class SquareTest {
	
	private static int getSuareRoot(int x) {

		return x * x *x;
	}

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			int result = getSuareRoot(i);
			System.out.println("square of" + i + "is :" + result);

		}

	}


}
