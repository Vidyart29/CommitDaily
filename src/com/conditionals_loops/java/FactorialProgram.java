package com.conditionals_loops.java;

import java.util.Scanner;

//factorial can be done in 2ways 1. using loops 2. using recursion
public class FactorialProgram {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("enter n : ");
		Scanner input = new Scanner(System.in);
		
		int n=input.nextInt();
		int fact=1;
		
		for (int i = 1; i <= n; i++) {
			fact = fact*i;
			
		}
		System.out.println("the factorial of " + n +" is: " + fact);
	}
}
