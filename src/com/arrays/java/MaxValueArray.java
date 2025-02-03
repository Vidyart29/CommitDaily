package com.arrays.java;

import java.util.Arrays;

public class MaxValueArray {

	public static void main(String[] args) {
//		int[]arr = {1, 2, 5, 89, 100, 0};
		int[]arr= {};
		maxValue(arr); 
		System.out.println("Given array is: "+ Arrays.toString(arr));
	}
	public static int maxValue(int[]arr) {
		if (arr.length== 0) {
			return -1;
			
		}
		int maxVal=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>maxVal) {
				maxVal=arr[i];
			}
		}
		System.out.println("max value of an array is: "+ maxVal);
		return maxVal;
		
	}
	
}
