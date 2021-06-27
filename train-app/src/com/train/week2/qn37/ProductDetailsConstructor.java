package com.train.week2.qn37;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProductDetailsConstructor {

	/*
	 * Question 37 : Product Details (Constructors) Create a class named Product
	 * with the following private member variables. • id of type Long • productName
	 * of type String • supplierName of type String Include appropriate getters and
	 * setters. Include a 3-argument constructor and a default constructor. Create a
	 * method “void display()” to display the product details. Create another class
	 * and write a main method to perform the following steps: . Read the input .
	 * Create instance of Product using 3 argument constructor.
	 * 
	 * Sample Input and Output : Enter the product id 1 Enter the product name
	 * Printer Enter the supplier name HP Product Id is 1 Product Name is Printer
	 * Supplier Name is HP
	 */

	/*
	 * PsuedoCode: Create three private variables and create constructor
	 */

	private long id;
	private String productName;
	private String supplierName;

	
	public ProductDetailsConstructor(long id, String productName, String supplierName) {
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
		
	}
	public void display() {
		System.out.println("Product Id is " + id + " Product Name is " + productName
				+ " Supplier Name is " + supplierName);
	}

}
