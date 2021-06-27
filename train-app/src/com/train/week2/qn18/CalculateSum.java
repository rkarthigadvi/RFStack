package com.train.week2.qn18;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CalculateSum {

	public static void main(String[] args) {

		/*
		 * Question 18: Create a class with a method which can calculate the sum of
		 * first n natural numbers which are divisible by 3 or 5. Method Name -
		 * calculateSum argument - int n Return Type - int sum Logic - Calculate the sum
		 * of first n natural numbers which are divisible by 3 or 5.
		 */

		/*
		 * PsuedoCode: initialize n, sum
		 * using for loop iterate the number
		 * if the iterator is divisible by 3 or 5 then add them 
		 *
		 */
		CalculateSum calSum = new CalculateSum ();
		System.out.println("Output of Sum Calculation : " + calSum.calculateSum(9));

	}

	public int calculateSum(int n) {
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;

	}
}
