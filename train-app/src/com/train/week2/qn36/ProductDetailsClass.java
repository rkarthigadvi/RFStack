package com.train.week2.qn36;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProductDetailsClass {

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
		 * PsuedoCode: Create three private variables and create getter setter
		 */

	private long id = 0;
	private String productName = "name";
	private String supplierName = "supp";
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	
	public void display() {
		System.out.println("Product Id is " +this.getId()+ " Product Name is " +this.getProductName()+ " Supplier Name is " +this.getSupplierName());
	}
	

}
