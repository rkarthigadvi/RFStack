package com.train.week2.qn21;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CalculateSumOfIndex {

	public static void main(String[] args) {

		/*
		 * Question 21 : Given a method with an int array. Write code to find the power of each individual element 
		 * according to its position index, add them up and return as output. 
		 * Example: input = {3,6,2,1} output = (3)0+(6)1+(2)2+(1)3 = 1+6+4+1=12
		 */

		/*
		 * PsuedoCode: initialize sum 
		 * iterate the input array and find the power of each number and then sum it
		 */
		CalculateSumOfIndex calsumind = new CalculateSumOfIndex();
		int calsum = calsumind.calculateSumOfIndex(new int[] {3, 6, 2, 1});
		System.out.println(calsum);

	}

	public int calculateSumOfIndex(int[] arr) {
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			sum += Math.pow(arr[i], i);
		}
		return sum;
	}
}
