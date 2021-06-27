package com.train.week2.qn28;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SecureUrl {

	public static void main(String[] args) {

		/*
		 * Question 28 : Secure URL Write a program to check whether the given URL is
		 * secure. Example: Secure URL: https://www.amazon.com/ Sample Input and Output
		 * 1: Enter the string http://www.amazon.com/ Enter the start string https
		 * "http://www.amazon.com/" does not start with "https" Sample Input and Output
		 * 2: Enter the string https://www.amazon.com/ Enter the start string https
		 * "https://www.amazon.com/" starts with "https"
		 */

		/*
		 * PsuedoCode: create variables for input and using substring method validate url starts with https / http / invalid url entered
		 */

		String input = "https://www.amazon.com/";

		if (input.substring(0, 5).equalsIgnoreCase("https")) {
			System.out.println(input + " starts with https");
		} else if (input.substring(0, 4).equalsIgnoreCase("http")) {
			System.out.println(input + " does not start with https");
		} else {
			System.out.println("Please enter a valid url");
		}

	}

}
