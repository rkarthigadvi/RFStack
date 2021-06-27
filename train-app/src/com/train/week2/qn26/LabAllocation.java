package com.train.week2.qn26;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LabAllocation {

	public static void main(String[] args) {

		/*
		 * Question 26 : Lab Allocation There are 3 labs in the CSE department (L1, L2
		 * and L3) with a seating capacity of x, y and z. Find the lab which has the
		 * minimal seating capacity. Input and Output Format: Assume that x, y and z are
		 * always distinct. Refer sample input and output. Sample Input and Output 1: x
		 * 30 y 40 z 20 L3 has the minimal seating capacity
		 */

		/*
		 * PsuedoCode: create three variables and get the input from scanner find among three which 
		 * value is lesser and print it. also check for distinct values.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Seating Capacity for Lab1 : ");
		int x = scan.nextInt();

		System.out.println("Enter Seating Capacity for Lab1");
		int y = scan.nextInt();

		System.out.println("Enter Seating Capacity for Lab1");
		int z = scan.nextInt();

		if (x < y && x < z) {
			System.out.println("L1 has minimal seating capacity : " +x);
		} else if (y < x && y < z) {
			System.out.println("L2 has minimal seating capacity : " +y);
		} else if (z < x && z < y) {
			System.out.println("L3 has mininal seating capacity : " +z);
		} else {
			System.out.println("Enter only distinct values for L1,L2,L3");
		}

	}

}