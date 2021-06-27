package com.train.week1.qn02;

public class FindNumberOfVowels {

	public static void main(String[] args) {
		
		/*
		 * Question 2: Find the number of vowels in a given string Input1:”NewyorkE” 'e'
		 * or 'E' - it should be counted as 1 Output1:2 Hint:irrespective of case
		 */

		/* PsuedoCode: Create a variable count and initialize it with 0; 
		 * Change the string to lowercase;
		 * Using for loop iterate the input convert input to character;
		 * Compare each character in the given string with vowels;
		 * Replace character with sapce to avoid adding count with the same character 
		 * If a match occurs increment the count Finally print count
		 */
		
		String input = "NewyorkE";
		int count = 0;
		input = input.toLowerCase();
		
		for (int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;	
				input = input.replace(ch, ' ');
			}			
		}
		System.out.println("Number of Vowels in the Given String : " +count);
	}
}
