package com.conditionals_loops.java;

import java.util.Scanner;

// Take integer inputs till the user enters 0 and print the largest number from all.
public class LargestFromUserInput {

	/*
	 * 1 7 1 12 3 
	 * 0 -> break 
	 * 12- largest
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
		System.out.println("");
		int largest = Integer.MIN_VALUE;
		
		while(true) {
			System.out.println("enter an in");
			int input = in.nextInt();

			if (input==0) {
				break;
			}
			if (input>largest) {
				largest=input;
			}
			
		}
		if (largest =Integer.MIN_VALUE) {
			System.out.println("not larger");
		}
		else {
			System.out.println("largest no is: "+ largest);
		}
	}*/
		
		 Scanner scanner = new Scanner(System.in);

	        int largest = Integer.MIN_VALUE;

	        System.out.println("Enter integers (enter 0 to finish):");

	        while (true) {
	            System.out.print("Enter an integer: ");
	            int input = scanner.nextInt();

	            if (input == 0) {
	                break; // Exit the loop if the user enters 0
	            }

	            if (input > largest) {
	                largest = input;
	            }
	        }

	        scanner.close();

	        if (largest == Integer.MIN_VALUE) {
	            System.out.println("No valid integers entered.");
	        } else {
	            System.out.println("The largest integer is: " + largest);
	        }
	}
}
