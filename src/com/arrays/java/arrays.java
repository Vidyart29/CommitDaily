package com.arrays.java;

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
		for (int i = 0; i < arr.length; i++) {
			arr[i]=in.nextInt();
		
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
