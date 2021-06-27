package com.train.week2.qn20;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringMirrorImage {

	public static void main(String[] args) {

		/*
		 * Question 20 : Create a class containing a method to create the mirror image
		 * of a String. The method should return the two Strings separated with a
		 * pipe(|) symbol . Method Name - getImage Argument - String Return Type -
		 * String Logic - Accepts One String. Find the mirror image of the String. Add
		 * the two Strings together separated by a pipe(|) symbol. For Example Input :
		 * EARTH Output : EARTH|HTRAE
		 */

		/*
		 * PsuedoCode: initialize result and the input string using for loop iterate the
		 * string to get the characters in the reverse order and then append it with the
		 * input string adding pipe symbol
		 *
		 */
		StringMirrorImage getMirrorImage = new StringMirrorImage();
		System.out.println("Mirror Image of the String : " + getMirrorImage.getImage("EARTH"));

	}

	public String getImage(String str) {
		String output = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			output += str.charAt(i);
		}
		return output = str + "|" + output;
	}
}
