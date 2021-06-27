package com.train.week1.qn14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConcatenateTheCharacter {

	public static void main(String[] args) {

		/*
		 * Question 14: Concatenate the character in a given position. If there is no character in a given position place "$" sign. 
		 * input1[]={"abc","da","ram"}; input2=3; hint : 3rd character is "c" in "abc" 3rd character is not present in "da",
		 * so place "$" 3rd character is "m" in "ram" concate all the characters to a single string "c$m" o/p string ="c$m";
		 */

		/*
		 * PsuedoCode: initialize result to store the result and store 3 in variable
		 * using for each loop iterate the input string
		 * if string lenght is greater than or equal to the position 
		 * then add the value to the result
		 * else add $ to the result and then print it
		 */

		String input[] = {"abc","da","ram"};
		int position = 3;
		String result = "";
		
		for (String str : input) {
			if (str.length() >= position) {
				char charAt = str.charAt(position - 1);
				result += charAt;
			} else {
				result += "$";
			}
			
		}
		System.out.println(result);
	}

}
