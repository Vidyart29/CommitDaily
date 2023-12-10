package com.conditionals_loops.java;

import java.util.Scanner;

public class FactorsOfNumber {

	public static void main(String[] args) {
		System.out.println("enter a no: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		System.out.println("factor of "+ num + " are: ");
		
		for (int i = 1; i <=num; i++) {
			
			if (num%i==0) {
				System.out.print(i+ " ");
			}
		}
	}
}
