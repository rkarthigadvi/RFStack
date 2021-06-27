package com.train.week2.qn41;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hexagon extends Shape{

	/*
	 * Question 41 : Area of a Shape (Runtime Polymorphism) We are enhancing the
	 * Area of a Shape to support calculation of area for Hexagon. Area of a Hexagon
	 * needs to be calculated, but the formula to calculate area is not known at the
	 * time of implementation. Hence, we are required to create the class Hexagon
	 * and not implement any method for calculating the area. Copy and paste all the
	 * classes available in the previous “Area of a Shape” program. Create a new
	 * class named Hexagon as per the specifications mentioned below. Note: Create a
	 * class called Hexagon that extends Shape Data members: side – of type Integer.
	 * Constructor: Create a constructor that initializes the side. (1-argument
	 * constructor). Call the super class constructor to initialize the shapeName as
	 * "Hexagon". Include appropriate getters and setters in all the given classes.
	 * Create a class Main to capture the input details from the user and display
	 * the calculated area to the user. Sample Input and Output 1: 1.Rectangle 2.
	 * Square 3. Circle 4. Hexagon Area Calculator --- Choose your shape 4 Enter
	 * Side: 20 Area of Hexagon is: 0.00
	 */

	/*
	 * PsuedoCode: Perform account transactions
	 */

	Integer side;

	public Integer getSide() {
		return side;
	}

	public void setSide(Integer side) {
		this.side = side;
	}

	public Hexagon(Integer side) {
		super("hexagon");
		this.side = side;
	}
}