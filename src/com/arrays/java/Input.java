package com.arrays.java;

import java.util.Arrays;
import java.util.Scanner;

public class Input {

	
	public static void main(String[] args) {
			
		Scanner inp = new Scanner(System.in);
		System.out.println("enter an input for array");
		
		// 1. ARRAY OF PRIMITIVES
		int[] arr = new int[5];
		
		arr[0]=12;
		arr[1]=98;
		arr[2]=234;
		arr[3]=345;
		arr[4]=1;
		
//		System.out.println(arr[3]);
/* 		
		//input for an array using for loop
		for (int i = 0; i < arr.length; i++) {
			arr[i]=inp.nextInt();
		} 		
		
		// print the array using for loop
		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+ " ");
		}
		
		//i wanted to print in array format only, i found how to do it by using arrays.tostring it will give me like [1, 2, 3, 4, 5]
		System.out.println(Arrays.toString(arr));
	
*/
		//2.  ARRAYS OF NON-PRIMITIVE
		String[] str = new String[4];
		for (int i = 0; i < str.length; i++) {
			str[i]=inp.next();
		}
		System.out.println(Arrays.toString(str));
		
		//modifying string
		str[2]="vidya";
		System.out.println(Arrays.toString(str));
	}
	
}
