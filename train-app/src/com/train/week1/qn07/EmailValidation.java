package com.train.week1.qn07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {

		/*
		 * Question 7 : Email Validation. Output is false if the validation fails else true. String input1="test@gmail.com" 
		 * 1)@ & : should be present; 2)@ & . should not be repeated; 3)there should be four charcters between @ and .; 
		 * 4)there shouls be atleast 3 characters before @ ; 5)the end of mail id should be .com; Expected Output=true
		 */

		/*
		 * PsuedoCode: initialize flag; 
		 * if input contains @ then validation will begin;
		 * take the length where @ and . present;
		 * if count of both values 1 then getin the loop 
		 * find the inde of @ and . then subtract them with -2
		 * if the output is 4 then check index of @ is 2 then
		 * check email.substring(email.length - 4 equals email.lenght of .com
		 * if i = length-1 then assign result+input[i] to the result 
		 * change the flag equal to true
		 * then print the result.
		 */

		String email = "test@gmail.com";
		boolean flag = false;
		Pattern validation =Pattern.compile("^[a-z]{4}+@[a-z]{5}+\\.[com]{3}$");
		Matcher match=validation.matcher(email);
		boolean matches = match.matches();
		System.out.println(matches);
	}

}
