package com.arrays.java;

import java.util.Arrays;

public class SwapArrayElements {

	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4, 5};
		swap(arr, 1, 3);
		System.out.println("the arrays is: "+Arrays.toString(arr));
	}
	public static void swap(int[] arr, int index1, int index2) {
		int temp= arr[1];
		arr[index1]=arr[3];
		arr[index2]=temp;
	}

}
