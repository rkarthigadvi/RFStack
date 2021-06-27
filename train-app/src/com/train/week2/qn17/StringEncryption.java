package com.train.week2.qn17;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringEncryption {

	public static void main(String[] args) {

		/*
		 * Question 17: Given a method with a string input. Write code to encrypt the
		 * given string using following rules and return the encrypted string: a.
		 * Replace the character at odd positions by next character in alphabet b. Leave
		 * the characters at even positions unchanged Note: if an odd position character
		 * is 'z' replace it by 'a' assume the first character in the string is at
		 * position 1 Example input = curiosity output = dusipsjtz
		 */

		/*
		 * PsuedoCode: initialize input, ch, i and output; using for loop iterate
		 * throught each letter if character present in the even position then add it to
		 * the output else get the character and increment it with 1; then convert to
		 * the character and add it to the output
		 */

		String input = "zzzzz";
		String output = "";
		char ch = ' ';
		int val;

		for (int i = 1; i <= input.length(); i++) {
			if (i % 2 == 0) {
				output += input.charAt(i - 1);
			} else {
				ch = input.charAt(i - 1);
				if (ch == 'z') {
					ch = 'a';
				} else {
				val = ch + 1;
				ch = (char) val;
				}
				output += ch;
			}
		}

		System.out.println("String Encryption Value : " + output);

	}
}
