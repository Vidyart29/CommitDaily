package com.conditionals_loops.java;

import java.util.Scanner;

public class FactorialusingRecursion {

	public static int fact(int n) {
		
		if(n<=1)
			return 1;
		else
			return n*(fact(n-1));
	}

	public static void main(String[] args) {
		
		System.out.println("enter n: ");
		Scanner inp= new Scanner(System.in);
		int n = inp.nextInt();

		System.out.println("factorial: "+ fact(n));
		
		
	}
}
