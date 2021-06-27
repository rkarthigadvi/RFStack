package com.train.week2.qn38;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DisplayTraineeDetailsClass {


		/*
		 * Question 38 : Display Trainee Details Write a program to read and display the
		 * Trainee details for the batch CHNFSD. Read the following Trainee details from
		 * the user: • Employee Id • Name Display the following details to the user: •
		 * Employee Id • Name • Batch Code Note: • Create a Class Trainee with instance
		 * variables employeeId and name with appropriate constructor and getter /
		 * setters. • Declare and initialize static variable BATCH_CODE in Trainee class
		 * as mentioned below. private static final String BATCH_CODE = “CHNFSD”; •
		 * Create a method display() in Trainee class to display the details to the
		 * user. • In each Java class the code should be organized in such a way the
		 * declarations are done in the order specified below. Please ensure that this
		 * order is organized in this class. static variables o instance variables o
		 * constructors o getters and setters o other methods • Create a class Main
		 * which does the following: o Read the number of Trainees details to be read o
		 * Read each Trainee employeeId and name. o Create an instance of Trainee class
		 * and invoke the display() method. Sample Input and Output: Enter the number of
		 * Trainees 2 Enter Employee Id 969143 Enter Name John Enter Employee Id 969144
		 * Enter Name Priya 969143 John CHNFSD 969144 Priya CHNFSD
		 */

		/*
		 * PsuedoCode: create private staic final string variable to store batch code
		 * and initalize variables for emp id emp name create getter setter and constructor
		 */

		private static final String Batch_Code = "CHNFSD";
		private String empName;
		private String empId;
		
		public DisplayTraineeDetailsClass (String empName, String empId) {
			super();
			this.empName = empName;
			this.empId = empId;			
		}
		
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public String getEmpId() {
			return empId;
		}
		public void setEmpId(String empId) {
			this.empId = empId;
		}
		public static String getBatchCode() {
			return Batch_Code;
		}
		
		void display() {
			System.out.println(this.getEmpName() + " " + getBatchCode() + " " + this.empId);
		}
		
		

}
