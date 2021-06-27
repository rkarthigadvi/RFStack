package com.train.week2.qn22;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MatchFirstAndLastChar {

	public static void main(String[] args) {

		/*
		 * Question 22 : Given a method with a string input. Write code to test if first and last characters are same. 
		 * Incase they are same return 1 else return -1 as output. Note: consider case.
		 * Example: input = "the picture was great" (first character = 't', last character = 't') output = 1
		 */

		/*
		 * PsuedoCode: if character at the 0 th position with the last position then return 1 else return -1
		 */
		System.out.println(matchFirstAndLastChar("the picture was great"));		

	}

	public static int matchFirstAndLastChar(String str) {
		if (str.charAt(0) == str.charAt(str.length() - 1)) {
			return 1;
		}
		return -1;
	}
}
