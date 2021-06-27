package com.train.week1.qn11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindAIntersectionB {

	public static void main(String[] args) {

		/*
		 * Question 11: Find A interscetion B Sample input: int[] a={1,2,3,4}; int[] b={3,4,5,6}; Sample output: int[] c={3,4}
		 */

		/*
		 * PsuedoCode: use ArrayList to perform this.
		 */

		int[] a={1,2,3,4}; 
		int[] b={3,4,5,6};
				
		ArrayList<Integer> intersection = new ArrayList<Integer>();
		for (int i=0; i<a.length; i++) {
			if (Arrays.binarySearch(b, a[i]) >= 0) {
				intersection.add(a[i]);
			}
		}
		System.out.println(intersection);
	}

}
