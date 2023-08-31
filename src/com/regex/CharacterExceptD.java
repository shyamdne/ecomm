package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterExceptD {
	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("\\D");
		Matcher matcher = pattern.matcher("a1b7 @z#");
		while (matcher.find()) {

			System.out.println(matcher.group() + "---->" + matcher.start());
		}
	}

}
