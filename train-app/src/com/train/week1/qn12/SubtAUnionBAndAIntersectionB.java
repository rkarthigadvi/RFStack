package com.train.week1.qn12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SubtAUnionBAndAIntersectionB {

	public static void main(String[] args) {

		/*
		 * Question 12: Find (A union B) - (A intersection B) Sample input: int[] a={1,2,3,4}; int[] b={3,4,5,6}; 
		 * a union b = {1,2,3,4,5,6} a intersection b = {3,4} (a union b) - (a intersection b) = {1,2,5,6} 
		 * Sample output: int[] c={1,2,5,6}
		 */

		/*
		 * PsuedoCode: use ArrayList to perform this.
		 */

		int[] a={1,2,3,4}; 
		int[] b={3,4,5,6};
				
		ArrayList<Integer> union = Union(a,b);
		ArrayList<Integer> intersection = Intersection(a,b);
		
		union.removeAll(intersection);
		
		for (int val : union) {
			System.out.println(val);
	}

}

	public static ArrayList<Integer> Union(int[] a, int[] b) {

		int length = a.length > b.length ? a.length : b.length;
		ArrayList<Integer> union = new ArrayList<>();

		for (int i = 0; i < length; i++) {
			if (i < a.length && !union.contains(a[i])) {
				union.add(a[i]);
			}
			if (i < b.length && !union.contains(b[i])) {
				union.add(b[i]);
			}
		}
		return union;
	}
	
	public static ArrayList<Integer> Intersection(int[]a, int[] b){

		ArrayList<Integer> intersection = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (Arrays.binarySearch(b, a[i]) >= 0) {
				intersection.add(a[i]);
			}
		}
		return intersection;
	}

}