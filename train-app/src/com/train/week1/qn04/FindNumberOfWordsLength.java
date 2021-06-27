package com.train.week1.qn04;

public class FindNumberOfWordsLength {

	public static void main(String[] args) {
		
		/*
		 * Question 4 : Find the number of words are of given length Input1:{“aa”,”b”,”cc”,”ddd”}
		 * Input2:2 Output1:2
		 * 
		 * Input1:{“aa”,”b”,”cc”,”ddd”} Input2:1 Output1:1
		 * 
		 * Input1:{“aa”,”b”,”cc”,”ddd”} Input2:3 Output1:1
		 */
		
		/*
		 * PsuedoCode: Get the words length from command line / program arguments;
		 * Create a variable count and initialize it with 0; 
		 * Using for each loop iterate the array;
		 * if match occurs then add it to the count
		 */
			
		String[] inputArray = { "aa", "b", "cc", "ddd"};
		int inputLength = Integer.parseInt(args[0]);
		int count = 0;
		
		for (String words : inputArray) {
			if (words.length() == inputLength) {
				count++;
			}
		}
		
		System.out.println("Number of Words Length : " +count );
	}
	
}