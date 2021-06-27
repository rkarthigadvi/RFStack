package com.train.week1.qn08;

public class SqureRootCalculation {

	public static void main(String[] args) {

		/*
		 * Question 8 : Square root calculation ((x1+x2)(x1+x2))+((y1+y2)(y1+y2)) o/p
		 * should be rounded of to int; Sample input: double x1=5; double x2=6; double
		 * y1=8; double y2=3; output : 15
		 */

		/*
		 * PsuedoCode: get the inputs in double do the claculation convert double to int
		 * then print the result.
		 */

		double x1 = 5;
		double x2 = 6;
		double y1 = 8;
		double y2 = 3;
		double calculation =  ((x1 + x2) * (x1 + x2))+((y1 + y2) * (y1 + y2));
		int squareRoot =  (int) Math.sqrt(calculation);
		System.out.println("Output of the SquareRoot Calculation : " +squareRoot);
	}

	
}
