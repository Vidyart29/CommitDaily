//Leetcode easy problem

package com.arrays.java;

import java.util.Arrays;

public class BuildArrayfromPermutation {

	public static void main(String[] args) {
		System.out.println("printing the given array");
		int[] nums= {0, 2, 1,5,3,4};
		int[] ans=new int[nums.length]; //build an array ans of the same length,--catch here, i have initialize ans with same size as of nums
		
		for (int i = 0; i < nums.length; i++) {
			ans[i]=nums[nums[i]];
		}
		System.out.println("ans is: "+Arrays.toString(ans));
	}
}
