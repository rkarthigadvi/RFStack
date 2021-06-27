package com.train.week2.qn31;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DayOfTheWeekNewKeyword {

	public static void main(String[] args) {

		/*
		 * Question 31 : Day of the Week (Using new keyword) Write a program to find the
		 * day of the week for the day number given. 1 should return Sun, 2 should
		 * return Mon, etc. Note: Declare and Initialize array elements using new
		 * keyword. Sample Input and Output: Enter the day number 3 Day of the week is
		 * Tue
		 */

		/*
		 * PsuedoCode: initialize array using new keyword, get the input from scanner and print the day of
		 * the number using arr[i-1]
		 */

		String arr[] = new String[] { "Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat" };

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the day number from 1 to 7: ");

		int i = scan.nextInt();

		System.out.println("Day of the Week : " + arr[i - 1]);

	}

}
