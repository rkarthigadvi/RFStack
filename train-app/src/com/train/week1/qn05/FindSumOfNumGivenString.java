package com.train.week1.qn05;

public class FindSumOfNumGivenString {

	public static void main(String[] args) {

		/*
		 * Question 5 : Find the sum of the numbers in the given input string array
		 * Input:{“2AA”,”12”,”ABC”,”c1a”) Output:6 (2+1+2+1); Note in the above array 12
		 * must not considered as such it must be considered as 1,2
		 */

		/*
		 * PsuedoCode: initialize sum with 0; 
		 * using for iterate the input string; 
		 * create a variable to get each string from an array;
		 * Using for loop iterate the new variable;
		 * if new varaiable has numers then will the numeric vlaue
		 * then add it.
		 */

		String[] input = { "2AA", "12", "ABC", "c1a" };
		int sum = 0;

		for (int i = 0; i < input.length; i++) {
			String input1 = input[i];
			for (int j = 0; j < input1.length(); j++) {
				if (input1.charAt(j) > '0' && input1.charAt(j) < '9') {

					int nums = Character.getNumericValue(input1.charAt(j));

					sum += nums;
				}
			}
		}

		System.out.println("Sum of Number in the Given String : " + sum);

	}

}
