package com.String;

public class SplitTEst {

	public static void main(String[] args) {
		String text = " java is a fun programme";

		String[] result = text.split(" ");
		System.out.print("result=  :");

		for (String str : result) {

			System.out.print(str + ", ");

		}

	}

}
