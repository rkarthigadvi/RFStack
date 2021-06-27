package com.train.week2.qn27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CompareTwoIntegers {

	public static void main(String[] args) {

		/*
		 * Question 27: Compare 2 Integers Write a program to relate 2 integers entered
		 * by the user as equal to, less than or greater than. Input and Output Format:
		 * Input consists of 2 integers. Sample Input and Output 1: Enter the first
		 * number 6 Enter the second number 8 6 is less than 8 Sample Input and Output
		 * 2: Enter the first number 8 Enter the second number 6 8 is greater than 6
		 * Sample Input and Output 3: Enter the first number 8 Enter the second number 8
		 * 8 is equal to 8
		 */

		/*
		 * PsuedoCode: create variables for inputs and get the input from user using scanner
		 * check whether the  input1 is equal or greater than or less than input2
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number :");
		int input1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		int input2 = sc.nextInt();
		
		if (input1 < input2) {
			System.out.println(input1 + " is less than " + input2);
		} else if (input1 > input2) {
			System.out.println(input1 + " is greater than " + input2);
		} else {
			System.out.println(input1 + " is equal to " + input2);
		}
		
	}

	
}
