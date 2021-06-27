package com.train.week2.qn35;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProfitAndLossUsingMethods {

	public static void main(String[] args) {

		/*
		 * Question 35 : Refer 24 Profit and Loss (Using Methods) Note: • Use methods to
		 * modularize the program coded earlier for this problem statement. • Create a
		 * method calculateProfit() with the below mentioned signature. public float
		 * calculateProfit(int dozenCount, int pricePerDozen, int sellPrice) • Invoke
		 * this method from the main method.
		 */

		/*
		 * PsuedoCode: create three variables and get the input from scanner
		 * find the actual price of one toy
		 * find the profit from selling price and actual price
		 * find the profit percentage by multiplying 100 with profilt/actual price of one toy
		 * use string.format to make two decimal point and then print it. a
		 * Acheive it by creating new method and calling the method in main method
		 */

		ProfitAndLossUsingMethods profit = new ProfitAndLossUsingMethods();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of Dozens of Toy purchased ");
		int numberOfDozensPurchased = scan.nextInt(); 
		
		System.out.println("Enter purchased rate for dozen of toys: ");
		int costPerDozen = scan.nextInt(); 
		
		System.out.println("Enter selling price of each toy ");
		int sellingPriceofOneToy = scan.nextInt(); 
		
		System.out.println("Profit Percentage : " +String.format("%.2f", profit.calculateProfit(numberOfDozensPurchased, costPerDozen, sellingPriceofOneToy)));
	

	}
	
	public float calculateProfit (int dozenCount, int pricePerDozen, int sellPrice) {
		
		float profitPercentage = 0;
		float actualPriceofOneToy = pricePerDozen / (float) 12.0; 
		
		float profit = sellPrice - actualPriceofOneToy;
	  
		profitPercentage = (profit / actualPriceofOneToy) * 100;
		
		return profitPercentage;
	  
		
	}

}
