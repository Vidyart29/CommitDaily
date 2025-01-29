package com.arrays.java;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionArrayList {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>>list= new ArrayList<>(5);
		
		Scanner scanner=new Scanner(System.in);
		
		
//		initialising
		for (int i = 0; i < 3; i++) {
			list.add(new ArrayList<>());
		}
			a
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			list.get(i).add(scanner.nextInt());
		}
	}
	
	System.out.println();
	}
}
  