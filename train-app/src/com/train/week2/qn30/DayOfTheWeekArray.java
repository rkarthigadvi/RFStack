package com.train.week2.qn30;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DayOfTheWeekArray {

	public static void main(String[] args) {

		/*
		 * Question 30 : Day of the Week (Using direct Array initialization) Write a
		 * program to find the day of the week for the day number given. 1 should return
		 * Sun, 2 should return Mon, etc. Note: Declare and Initialize array in a single
		 * line using curly braces. Sample Input and Output: Enter the day number 3 Day
		 * of the week is Tue
		 */

		/*
		 * PsuedoCode: initialize array, get the input from scanner and print the day of the number using arr[i-1]
		 */

		String[] arr = { "Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat"  };
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the day number from 1 to 7: ");
		
		int i = scan.nextInt();
		
		System.out.println("Day of the Week : " + arr[i-1]);

	}

}
