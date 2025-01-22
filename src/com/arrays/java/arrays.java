package com.arrays.java;

import java.util.Arrays;
import java.util.Iterator;
//import java.util.Iterator;
import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		
//		Scanner myObj=new Scanner(System.in);
//		System.out.println("Array list is:");
		
//		use to store multiple elements or values in single variable
	
// 		13th jan 2025

/**	
 * ARRAY of PRIMITIVES
//		trying to take array input without worring about the size of array. 
		int arraysize;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array you want: ");
		arraysize=sc.nextInt();
		String[] car=new String[arraysize];
		
		System.out.println("those arrays are: ");
	car[0]="tesla ";
		car[1]="creta ";
		car[2]="tata_motors ";
		car[3]="moto ";
		car[4]="hello ";
		
//		System.out.println(car[0]);
		
		for (int i = 0; i < car.length; i++) {
			System.out.print(car[i]);
		}
**/
	
//	taking array as input dynamically without worring about size and value array would have.
		int arraySize;
		Scanner in=new Scanner(System.in);
		System.out.println("enter size of array you want: ");
		arraySize=in.nextInt();

		int[]arr=new int[arraySize];
		System.out.println("enter values of array: ");	
		
//		1st for loop to take values continously from user.
		for (int i = 0; i < arr.length; i++) {
			arr[i]=in.nextInt();
		
		}
//		2nd for loop is just to print an array elements
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+ " ");
		}
//		2nd way to print values provided by a user as an array use arrays.toString()
		System.out.println(Arrays.toString(arr));
		
		for (int i : arr) { // for every element in the array print the element.
			System.out.println("coming from foreach loop "+ i+ " ");
		} 
	}
	

}
