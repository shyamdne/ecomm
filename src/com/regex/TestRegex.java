package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("ab");
		Matcher matcher = pattern.matcher("ababababab");

		int count = 0;
		while (matcher.find()) {

			System.out.println(
					matcher.group() + "------------------>" + matcher.start() + "--------------->" + matcher.end());

			count = count + 1;

		}

		System.out.println("number of occurence" + count);

	}

}
