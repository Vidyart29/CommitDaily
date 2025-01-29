package com.arrays.java;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

import java.util.Scanner;


public class ArrayListExample {


	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
//		SYNTAX 
		ArrayList<Integer> arrList=new ArrayList<>();
		/*
		arrList.add(67);
		arrList.add(1);
		arrList.add(3);
//		arrList.add(4);
		arrList.add(18);
		*/
		System.out.println(arrList);
//		System.out.println(arrList.contains(11));
//	update the elements of arraylist.
//		System.out.println(arrList.set(0, 11));
//		System.out.println(arrList);
//		System.out.println(arrList.remove(1));
//		System.out.println(arrList);
		System.out.println("size of array is: "+ arrList.size());
		
//		for loop implement on arraylist
		System.out.println("enter elements for arraylist is:...");
		for (int i = 0; i < 5; i++) {
			 arrList.add(scanner.nextInt());
					
		}
		System.out.println(arrList + " ");
		for (int i = 0; i < 5; i++) {
			System.out.print(arrList.get(i)+" ");
			 
		}
		System.out.println();
		System.out.println(arrList.size());
		System.out.println(arrList.containsAll(arrList));
		System.out.println(arrList.remove(3));
		System.out.println(arrList);

	}
}
