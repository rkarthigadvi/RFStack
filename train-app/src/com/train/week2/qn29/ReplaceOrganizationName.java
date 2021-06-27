package com.train.week2.qn29;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ReplaceOrganizationName {

	public static void main(String[] args) {

		/*
		 * Question 29 : Replace Organization Name This program is to illustrate the use
		 * of the method replace() defined in the string API. Two companies enter into a
		 * Marketing Agreement and they prepare an Agreement Draft. After that one of
		 * the companies changes its name. The name changes need to be made in the
		 * Agreement Draft as well. Write a program to perform the name changes in the
		 * agreement draft. Sample Input and Output : Enter the content of the document
		 * ITT is a private organisation. ITT is a product based company. DBox is a ITT
		 * product Enter the old name of the company ITT Enter the new name of the
		 * company TTT The content of the modified document is TTT is a private
		 * organisation. TTT is a product based company. DBox is a TTT product
		 */

		/*
		 * PsuedoCode: create variables for input and using substring method validate
		 * url starts with https / http / invalid url entered
		 */

		System.out.println("Enter the content of document");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		
		System.out.println("Enter the old name of the company ");
		String oldName=scan.nextLine();
		
		System.out.println("Enter the new name of the company ");
		String newName=scan.nextLine();
		
		input = input.replace(oldName, newName);
		System.out.println("Updated Name : " +input);
		
	}

}
