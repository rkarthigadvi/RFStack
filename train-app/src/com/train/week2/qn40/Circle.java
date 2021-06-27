package com.train.week2.qn40;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Circle extends Shape{

	/*
	 * Question 40 : Area of a Shape Write a program to calculate the area of the
	 * given shape using a menu driven application. Create a base class called
	 * Shape. Data members: protected String shapeName; Methods: calculateArea()
	 * –Return type of this method is Double. This method should return the value 0.
	 * Constructor: Create a single argument constructor that initializes the
	 * shapeName. Create a class called Square that extends Shape Data members: side
	 * – of type Integer. Methods: calculateArea() – calculates and returns the area
	 * of the square. The return type of this method is Double. Constructor: Create
	 * a constructor that initializes the side. (1-argument constructor). Call the
	 * super class constructor to initialize the shapeName as "Square". Create a
	 * class called Rectangle that extends Shape Data members: length – of type
	 * Integer. breadth – of type Integer. Methods: calculateArea() – calculates and
	 * returns the area of the Rectangle. The return type of this method is Double.
	 * Constructor: Create a constructor that initializes the length and breadth.
	 * (2-argument constructor). Call the super class constructor to initialize the
	 * shapeName as "Rectangle". Create a class called Circle that extends Shape
	 * Data members: radius – of type Integer. Methods: calculateArea() – calculates
	 * and returns the area of the Circle. The return type of this method is Double.
	 * Constructor: Create a constructor that initializes the radius. (1-argument
	 * constructor). Call the super class constructor to initialize the shapeName as
	 * "Circle". Include appropriate getters and setters in all the given classes.
	 * Create a class Main to capture the input details from the user and display
	 * the calculated area to the user. Sample Input and Output 1: 1.Rectangle
	 * 2.Square 3.Circle Area Calculator --- Choose your shape 1 Enter length and
	 * breadth: 100 40 Area of Rectangle is:4000.00 Sample Input and Output 2:
	 * 1.Rectangle 2.Square 3.Circle Area Calculator --- Choose your shape 2 Enter
	 * side: 20 Area of Square is:400.00 Sample Input and Output 3: 1.Rectangle
	 * 2.Square 3.Circle Area Calculator --- Choose your shape 3 Enter Radius: 5
	 * Area of Circle is:78.54
	 */

	/*
	 * PsuedoCode: Perform area of shape calculations
	 */

	Integer radius;

	public Circle(Integer radius) {
		super("circle");
		this.radius=radius;
	}
	
	public Double calculateArea()
	{
		double scale=Math.pow(10, 2);
		return Math.round(Math.PI * radius * radius * scale)/scale ;
	}

	public Integer getRadius() {
		return radius;
	}

	public void setRadius(Integer radius) {
		this.radius = radius;
	}
}