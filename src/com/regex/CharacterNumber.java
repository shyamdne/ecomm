package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterNumber {
	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("\\w");
		Matcher matcher = pattern.matcher("a1b7 @z#");
		while (matcher.find()) {

			System.out.println(matcher.group() + "---->" + matcher.start());
		}

}
}