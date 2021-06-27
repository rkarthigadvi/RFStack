package com.train.week1.qn06;

public class ConvertStringArraytoString {

	public static void main(String[] args) {

		/*
		 * Question 6 : Convert String array to String String[] input1=["Vikas","Lokesh",Ashok] 
		 *Expected output String: "Vikas,Lokesh,Ashok"
		 */

		/*
		 * PsuedoCode: initialize string variable to store the result; 
		 * get the length of the input variable; 
		 * Using for loop iterate the input variable;
		 * if i = length-1 then assign result+input[i] to the result 
		 * else add result+input[i]+, to the result
		 * then print the result.
		 */

		String[] input = { "Vikas","Lokesh", "Ashok" };
		String result = "";
		int len = input.length;

		for (int i = 0; i < len; i++) {
				if (i == len-1) {
					
					result += input[i];
					
				} else {
					
					result += input[i] + ",";
				}
		}

		System.out.println("Sum of Number in the Given String : " + result);

	}

}
