package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharecterTest1 {
	
	
	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("\\d");
		Matcher matcher = pattern.matcher("a1b7 @z2#");
		while (matcher.find()) {

			System.out.println(matcher.group() + "---->" + matcher.start());
		}

}
}