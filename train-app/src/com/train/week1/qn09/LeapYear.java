package com.train.week1.qn09;

public class LeapYear {

	public static void main(String[] args) {

		/*
		 * Question 9: Calculate whether given year as leap or not; 
		 * Sample input: int year = 2020; Sample output: boolean isLeapYear = true;
		 */

		/*
		 * PsuedoCode: when the input is divived by 4 then remainder should be 0 
		 * and if it is divided by 100 then remainder should not be 0
		 * or it is divided by 400 then remainder should be 0
		 */

		int year = 2020;
		
		boolean isLeapYear = false;
		
		if (year % 4 == 0 && year % 100 !=0 || (year % 400 == 0)) {
			isLeapYear = true;
			System.out.println(isLeapYear);
		} 
		
		System.out.println(isLeapYear);

	}

}
