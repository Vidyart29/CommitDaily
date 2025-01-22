package com.arrays.java;

import java.util.Scanner;

import javax.swing.RowFilter;

public class MultiDimension {

	public static void main(String[] args) {
//		System.out.println("enter the array ele..");
//		Scanner in=new Scanner(System.in);
		
//		int [][]arr= new int[3][4];
//		System.err.println("the lenght of arr is : "+ arr.length);
//		int [][] arr2D= {
//				
//				{1, 2,3}, //0th index
//				{4, 5}, //1st index
//				{6, 7, 8, 8} //2nd index -> arr2D[2][0]={6}
//		}; 
		

//		how to input a multidimension array in java
//		i=row, j=col
		
		Scanner in= new Scanner(System.in);
		System.out.println("enter no of rows and colums for a 2d arr:  ");
		int m=in.nextInt();
		int n=in.nextInt();
		
//		array initialized and declared
		int [][]arr= new int[m][n];
		System.err.println("the lenght of arr is : "+ arr.length);
		
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col< arr[row].length; col++) {
				arr[row][col]=in.nextInt();
			}
		}
		
//		output - printing multidimension array
		
		System.out.println("the 2d array is: ");
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
			System.out.println(arr[row][col]+ " ");	
			}
		}
		System.out.println();
	}
}

