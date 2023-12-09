package com.arrays.java;

import java.util.Iterator;
import java.util.Scanner;

public class InputsInArray {
public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	System.out.println("enter input: ");
	
	int[]arr= new int[5];
	/*
	 * arr[0]=12; arr[1]=1; arr[2]=2; arr[3]=11; arr[4]=9;
	 * 
	 * System.out.println(arr[4]);
	 */

	for (int i = 0; i < arr.length; i++) {
		arr[i]= input.nextInt();
		System.out.println("line 20: " +arr[i]);
		System.out.print(i);

		int sum = i+arr[i];
		System.out.println(" sum is "+ sum);
	}
}

}
