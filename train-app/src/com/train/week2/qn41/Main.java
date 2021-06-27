package com.train.week2.qn41;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	/*
	 * Question 41 : Area of a Shape Write a program to calculate the area of the
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

	public static void main(String[] args) {
		
		System.out.println("1.Rectangle 2.Square 3.Circle 4. Hexagon Area Calculator --- Choose your shape");
		Scanner scan=new Scanner(System.in);
		int choice=scan.nextInt();
		if(choice == 1)
		{
			System.out.println("Enter length and breadth:");
			Shape rectangle=new Rectangle(scan.nextInt(),scan.nextInt());
			System.out.println("Area of "+rectangle.getShapeName()+" is: "+rectangle.calculateArea());
		}
		
		else if (choice == 2) {
			System.out.println("Enter side:");
			Shape square=new Square(scan.nextInt());
			System.out.println("Area of "+square.getShapeName()+" is: "+square.calculateArea());
			
		} else if (choice == 3) {
			System.out.println("Enter radius:");
			Shape circle=new Circle(scan.nextInt());
			System.out.println("Area of "+circle.getShapeName()+" is: "+circle.calculateArea());	
		} else if(choice == 4)
		{
			System.out.println("Enter side:");
			Shape hexagon=new Hexagon(scan.nextInt());
			System.out.println("Area of "+hexagon.getShapeName()+" is: "+hexagon.calculateArea());
		}
	scan.close();
	}
}