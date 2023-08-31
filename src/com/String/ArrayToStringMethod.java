package com.String;

import java.util.Arrays;

public class ArrayToStringMethod {

	public static void main(String[] args) {
		String vowels = "a::b::c::d:e";

		// split att ::
		// stroing array in string
		String[] result = vowels.split("::");
		
		 String string = Arrays.toString(result);
		 System.out.println("result ="+string);

		// CONVERTING ARRAY INTO STRING AND PRINT IT
		System.out.println("result = " + Arrays.toString(result));

	}
}
