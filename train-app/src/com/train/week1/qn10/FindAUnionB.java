package com.train.week1.qn10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindAUnionB {

	public static void main(String[] args) {

		/*
		 * Question 10: Find A union B Sample input: int[] a={1,2,3,4}; int[] b={3,4,5,6}; 
		 * Sample output: int[] c={1,2,3,4,5,6}
		 */

		/*
		 * PsuedoCode: use ArrayList to perform this.
		 */

		int[] a={1,2,3,4}; 
		int[] b={3,4,5,6};
		
		int length = a.length > b.length ? a.length : b.length;
		ArrayList<Integer> union = new ArrayList<Integer>();
		
		for (int i=0; i<length; i++) {
			if (i<a.length && !union.contains(a[i])) {
				union.add(a[i]);
			} 
			if (i<b.length && !union.contains(b[i])) {
				union.add(b[i]);
				
			}
		}
		
		System.out.println(union);
	}

}
