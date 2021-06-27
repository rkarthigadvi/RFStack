package com.train.week2.qn36;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProductDetailsInstance {
	public static void main(String[] args) {
		
		/*
		 * Question 36 : Product Details (Class and Instance) Create a class named
		 * Product with the following private member variables.id of type Long
		 * productName of type String supplierName of type String Include appropriate
		 * getters and setters. Create another class and write a main method to perform
		 * the following steps: Read the input Create instance of Product and set the
		 * values into Product instance using setter methods. Display the output as
		 * listed in the sample Output/Input using getter methods. Sample Input and
		 * Output: Enter the product id 1 Enter the product name Printer Enter the
		 * supplier name HP Product Id is 1 Product Name is Printer Supplier Name is HP
		 */

		/*
		 * PsuedoCode: Create instance and get / set the values to private variables from prev method
		 */

	ProductDetailsClass productDetails = new ProductDetailsClass();
	
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter the prodcut id : ");
	productDetails.setId(scan.nextLong());
	
	System.out.println("Enter the prodcut name : ");
	productDetails.setProductName(scan.next());
	
	System.out.println("Enter the supplier name : ");
	productDetails.setSupplierName(scan.next());
	
	productDetails.display();
	}

}
