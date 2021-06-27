package com.train.week1.qn01;

public class Calculator {

	/*
	 * Question 1 : Create a calculator class to perform addition, subtraction, multiplication
	 * and division of two integers. Get inputs from command line/program arguments.
	 */
	
	// PsuedoCode: Get the input from command line / program arguments and perform the calculation.
	
	public static void main(String[] args) {
		System.out.println("Arithmetic Calculator");
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("Addition : "+ (a+b));
		System.out.println("Subtraction : "+ (a-b));
		System.out.println("Multiplication : "+ (a*b));
		System.out.println("Division : "+ (a/b));	
	}
}