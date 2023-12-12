package com.conditionals_loops.java;

import java.util.Scanner;


public class ExitOnUserInput {
	/*
	 * logic is when i have an input given by user is shld continue summing it up
	 * but, as an when user enters 0 it shld get exited and print the integers sum
	 */	
	public static void main(String[] args) {
		System.out.println("while loop eg ");
		Scanner in = new Scanner(System.in);
		
		int input;
		int sum =0;
		
		while (true) {
			System.out.println("enter a no: ");
			
			input = in.nextInt();
			sum+=input;
			if(input ==0) {
				System.out.println("oh no! you have entered 0, exiting from the state");
			break;
			
			}
			
		}
		System.out.println("sum of numbers is "+ sum);
	
	}
}
