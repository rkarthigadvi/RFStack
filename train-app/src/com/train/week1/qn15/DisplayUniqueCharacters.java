package com.train.week1.qn15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DisplayUniqueCharacters {

	public static void main(String[] args) {

		/*
		 * Question 15: Display unique characters in a string. input:"helloworld" output:"helowrd"
		 */

		/*
		 * PsuedoCode: initialize input
		 * iterate the input and add result and each character of the input
		 * replace empty character with the input and store the remaining
		 * replace all space with empty.
		 * 
		 */

		String input = "hellowworld";
		String result = "";
		
		for (int i=0; i<input.length(); i++) {
			result += input.charAt(i);
			input = input.replace(input.charAt(i), ' ');
		}
		result = result.replaceAll(" ", "");
		System.out.println(result);
	}

}
