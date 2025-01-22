package com.arrays.java;

//complete code to input ele and print a multidimension array, 3d becomes diff to visualize but could be done.
import java.util.Scanner;

public class TwoDArrays {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter no of rows and cols: ");
		int rows= scanner.nextInt();
		int cols= scanner.nextInt();
		
		int[][]arr=new int[rows][cols];
		
//		input values for 2d array
//		NOTE: while entering elements count row x col and enter that many ele
		System.out.println("enter elements of the 2d array: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]= scanner.nextInt();
			}
		}
		System.out.println("printing 2d array: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
