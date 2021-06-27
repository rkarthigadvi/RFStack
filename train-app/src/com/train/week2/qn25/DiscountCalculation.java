package com.train.week2.qn25;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DiscountCalculation {

	public static void main(String[] args) {

		/*
		 * Question 25 : Discount Calculation Calculate the discount based on the price
		 * of two items and the overall discount percentage. Input Format: Item 1 price
		 * as floating point Item 2 price as floating point Discount as integer Output
		 * Format: Total of Item 1 and Item 2 Price after discount (correct to 2 decimal
		 * places) Amount discounted (correct to 2 decimal places) Sample Input and
		 * Output Format: Price of item 1 : 20.50 Price of item 2 : 45.40 Discount in
		 * percentage : 10 Total amount : $65.90 Discounted amount : $59.31 Saved amount
		 * : $6.59
		 */

		/*
		 * PsuedoCode: create three variables and get the input from scanner find the
		 * actual price of one toy find the profit from selling price and actual price
		 * find the profit percentage by multiplying 100 with profilt/actual price of
		 * one toy use string.format to make two decimal point and then print it
		 */
		DiscountCalculation disCal = new DiscountCalculation();
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the first item price");
		float firstItem = scan.nextFloat();
		
		System.out.println("Enter the second item price");
		float secondItem = scan.nextFloat();
		
		System.out.println("Enter the discount percentage");
		int discount = scan.nextInt();
		
		disCal.discountCalculation(firstItem, secondItem, discount);
		
		
	}
	
	void discountCalculation (float Item1, float Item2, int discount) {
		
		
		float totalAmount = Item1 + Item2;
		System.out.println("Total of Item1 and Item2 : " + String.format("%.2f", totalAmount));
		
		double discountAmount = (totalAmount * discount) / 100.00;
				
		double savedAmount = totalAmount - discountAmount;
		System.out.println("Amount Saved : " + String.format("%.2f", savedAmount));
		
		System.out.println("Amount Discounted : " + String.format("%.2f", discountAmount));
		
		
		

}
}