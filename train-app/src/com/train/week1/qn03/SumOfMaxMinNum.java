package com.train.week1.qn03;

public class SumOfMaxMinNum {

	public static void main(String[] args) {
	
		/*
		 * Question 3 : Find the sum of maximum and minimum number from a given input
		 * array Input:{19,17,12} max - 19 min - 12 sum - 31 Output:31
		 */		
		/* PsudeoCode: initialize maximum and minimum Value with 0;
		 * Using for loop iterate the input; compare input array with maximum value;
		 * if input array value is greater than maximum value then assign it to the maximum number; 
		 * else if input array value is smaller than minimum values then assign it to the minimum number; 
		 * then add both maximum and minimum number;
		 */
		
		int[] inputArray = {21, 5, 17};
		int maxValue = 0;
		int minValue = inputArray[0];
		
		for (int i=0; i<inputArray.length; i++) {
			if (inputArray[i] > maxValue) {
			maxValue = inputArray[i];
		} else if (inputArray[i] < minValue) {
			minValue = inputArray[i];
		}
		
	}
	System.out.println("Maximum Number : " +maxValue);
	System.out.println("Minimum Number : " +minValue);
    System.out.println("Sum of Maximum and Mimum Numbers : " +(maxValue+minValue));
	
	}
}
