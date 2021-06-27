package com.train.week2.qn19;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CalculateDifference {

	public static void main(String[] args) {

		/*
		 * Question 19 : Create a class with a method to find the difference between the
		 * sum of the squares and the square of the sum of the first n natural numbers.
		 * Method Name - calculateDifference Argument - int n Return Type - int sum
		 * Logic - Find the difference between the sum of the squares of the first n
		 * natural numbers and the square of their sum. For Example if n is 10,you have
		 * to find (1^2+2^2+3^2+….9^2+10^2)- (1+2+3+4+5…+9+10)^2
		 */

		/*
		 * PsuedoCode: initialize n, sum using for loop iterate the number  and find sum of number and sum of square
		 * then find the difference of both
		 *
		 */
		CalculateDifference calDiff = new CalculateDifference();
		System.out.println("Output of Difference Calculation : " + calDiff.calculateDifference(2));

	}

	public int calculateDifference(int n) {
		return calculateSquare(n) - calculateSum(n);
	}

	public int calculateSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	public int calculateSquare(int n) {
		int sumOfSquares = 0;
		for (int i = 1; i <= n; i++) {
			sumOfSquares += Math.pow(i, 2);
		}
		return sumOfSquares;
	}
}
