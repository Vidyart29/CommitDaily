package com.vidya.java;

import java.util.Arrays;

public class ChangeValue {

	public static void main(String[] args) {
		int[]arr= {1, 2,3,4,5};
		change(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void change(int[] nums) {
		// TODO Auto-generated method stub
		nums[0]=99;
		
	}
}
