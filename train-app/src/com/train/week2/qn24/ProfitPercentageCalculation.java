package com.train.week2.qn24;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProfitPercentageCalculation {

	public static void main(String[] args) {

		/*
		 * Question 24 : Profit and Loss Sam purchased x dozens of toys at the rate of
		 * Rs. y per dozen. He sold each one of them at the rate of Rs. z. Can you
		 * please help him out percentage of profit? Given the values of x, y and z,
		 * write a program to compute Sam's profit percentage. Example: Dozens of toys
		 * purchased (x) = 20 Rate per dozen (y) = Rs. 375 Selling price per toy (z) =
		 * Rs. 33 Cost Price of 1 toy = 375/12 = Rs. 31.25 Selling Price of 1 toy =
		 * Rs.33 Profit = 33 - 31.25 = Rs. 1.75 Profit % = 1.75 / 31.25 * 100 = 5.6%
		 * Input Format: Input consists of 3 integers – x, y and z. x - Number of dozens
		 * purchased. y - Cost per dozen. z - Selling price per item. Output Format: The
		 * profit percentage needs to be printed correct to 2 decimal places. Sample
		 * Input and Output: number of dozens of toys purchased 20 price per dozen 375
		 * selling price of 1 toy 33 Sam's profit percentage is 5.60 percent
		 */

		/*
		 * PsuedoCode: create three variables and get the input from scanner
		 * find the actual price of one toy
		 * find the profit from selling price and actual price
		 * find the profit percentage by multiplying 100 with profilt/actual price of one toy
		 * use string.format to make two decimal point and then print it
		 */


		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of Dozens of Toy purchased ");
		int numberOfDozensPurchased = scan.nextInt(); 
		
		System.out.println("Enter purchased rate for dozen of toys: ");
		int costPerDozen = scan.nextInt(); 
		
		System.out.println("Enter selling price of each toy ");
		int sellingPriceofOneToy = scan.nextInt(); 
		
		double profitPercentage = 0;
		double actualPriceofOneToy = costPerDozen / 12.0; 
		
		double profit = sellingPriceofOneToy - actualPriceofOneToy;
	  
		profitPercentage = (profit / actualPriceofOneToy) * 100;
		
		System.out.println("Profit Percentage : " +String.format("%.2f", profitPercentage));
	  
	 }
	
}