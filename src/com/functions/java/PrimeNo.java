package com.functions.java;

import java.util.Scanner;

public class PrimeNo {

	private static boolean prime(int number) {
		// TODO Auto-generated method stub
		
	
			if (number<=1) {
				return false;
			}
			for (int i = 2; i < number-1; i++) {
				if (number/i ==0) {
					return false;
				}
			}
		return true;
	}
	
	

	public static void main(String[] args) {
		System.out.println("enter any number: ");
		
		Scanner inp= new Scanner(System.in);
		int number = inp.nextInt();
		//some function calling
		
		if (prime(number)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		
	}
}
