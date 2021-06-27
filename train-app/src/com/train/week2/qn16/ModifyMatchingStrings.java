package com.train.week2.qn16;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ModifyMatchingStrings {

	public static void main(String[] args) {

		/*
		 * Question 16: Given a method with two strings as input. Write code to modify
		 * the first string such that all characters are replace by plus sign(+) except
		 * the characters which are present in the second string. That is, if one or
		 * more characters of first string appear in second string, they will not be
		 * replace by +. Return the modified string as output. Note-ignore case.
		 * Example: input1 = New York input2 = New Jersy output = New Y+r+
		 */

		/*
		 * PsuedoCode: initialize two strings and output; create string array and split
		 * input1 and store using for each iterate array if input2 contains any of the
		 * letter from input1 array then add it to the output else add + to the output
		 * 
		 */

		String input1 = "New York";
		String input2 = "New Jersy";
		String output = "";
		String arr[] = input1.split("");
		for (String Match : arr) {
			if ((input2.toLowerCase()).contains(Match.toLowerCase())) {
				output += Match;
			} else
				output += "+";
		}

		System.out.println("Modify Matching String Value : " + output);
	}
}
