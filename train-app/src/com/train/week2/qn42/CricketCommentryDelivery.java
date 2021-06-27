package com.train.week2.qn42;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CricketCommentryDelivery {

	/*
	 * Question 42 : Cricket Commentary Automation Hope you would have used a
	 * cricket website that provides a ball by ball text commentary. Write a program
	 * to automate the text messages for each delivery. Initially we must automate
	 * the below two display variations: Option 1: Batsman and Bowler details of the
	 * delivery Option 2: Number of runs scored in the delivery Based on user’s
	 * input, either the Option 1 or Option 2 details will be displayed to the user.
	 * Note: Create a class named Delivery. There are no attributes in this class.
	 * Include the following methods in the Delivery class. • void
	 * displayDeliveryDetails(String bowler, String batsman) --- In this method,
	 * print the last names of the bowler and batsman of that particular delivery. •
	 * void displayDeliveryDetails(Long runs) --- In this method, display the run
	 * details of that delivery. If the number of runs scored in that delivery is 6
	 * or 4 then display “It is a Sixer.” or “It is a boundary.” along with the
	 * number of runs, else print only the number of runs. Create a Main class to
	 * read the user inputs and invoke the displayDeliveryDetails() with appropriate
	 * parameters. Sample Input and Output 1: Menu 1.Player details of the delivery
	 * 2.Run details of the delivery 1 Enter the bowler name Ravichandran Aswin
	 * Enter the batsman name Virat Kohli Player details of the delivery: Bowler :
	 * Ashwin Batsman : Kohli Sample Input and Output 2: Menu 1.Player details of
	 * the delivery 2.Run details of the delivery 2 Enter the number of runs 2
	 * Number of runs scored in the delivery : 2 Sample Input and Output 3: Menu
	 * 1.Player details of the delivery 2.Run details of the delivery 2 Enter the
	 * number of runs 4 Number of runs scored in the delivery : 4 It is a boundary.
	 */

	/*
	 * PsuedoCode: Perform account transactions
	 */

	void displayDeliveryDetails(String bowler, String batsman) {

		System.out.println("Bowler Name is : " + bowler + " Batsman Name is : " + batsman);

	}

	void displayDeliveryDetails(long runs) {

		System.out.println("Number of runs scored in the delivery : " + runs);
		if (runs == 4)
			System.out.println("It is a boundary. Number of runs scored in the delivery :" + runs);
		else if (runs == 6)
			System.out.println("It is a sixer. Number of runs scored in the delivery :" + runs);

	}

}