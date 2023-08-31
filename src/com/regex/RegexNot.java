package com.regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexNot {
	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("[^abc]");
		Matcher matcher = pattern.matcher("a1b7@z#");
		while (matcher.find()) {

			System.out.println(matcher.group() + "---->" + matcher.start());
		}

	}

}
