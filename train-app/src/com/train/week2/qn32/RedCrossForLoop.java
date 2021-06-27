package com.train.week2.qn32;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RedCrossForLoop {

	public static void main(String[] args) {

		/*
		 * Question 32 : The Red Cross (for loop) On an event of a natural calamity, Red
		 * Cross is responsible to present the accurate details of the number of people
		 * who were rescued and sought refuge in the camps.Write a program to
		 * facilitate Red Cross authorities record the total number of refugees from
		 * each tent of the camps given the number of tents. Note: Use integer array
		 * to store the number of refugees present in each tent. Use for loop to store
		 * people count in tent and calculate the total number of people. Input Format:
		 * First line of the input is an integer value that corresponds to the number of
		 * tents in the camp. The next n lines of input contains the number of refugees
		 * staying in each of the tents. Output Format: Output should print the total
		 * number of citizens present in the camp. Sample Input and Output: 5 10 12 30
		 * 12 12 76
		 */
		
		/*
		 * PsuedoCode: get the input using scanner and initialize int array
		 * using for loop iterate the number of tents and ask the user to enter number of refugess present in each tent
		 * iterate it using arr[i] then sum all the numbers and print it
		 */


		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the total number of tents: ");
		int n = scan.nextInt();
		int arr[] = new int[n];
		int sum = 0;
		
		for (int i=0; i<n; i++) {
			int temp = i;
			System.out.println("Enter the number of refugees staying in " +(temp+1) + "tent");
			arr[i]= scan.nextInt();
			sum += arr[i];
		}
		
		System.out.println("Total Number of Citizens Present in the Camp : " +sum);

		

	}

}
