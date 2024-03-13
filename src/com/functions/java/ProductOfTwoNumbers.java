package com.functions.java;

import java.util.Scanner;

public class ProductOfTwoNumbers {

	
	public static void main(String[] args) {
		System.out.println("enter 2 no: (give space)");
		
		Scanner inp=new Scanner(System.in);
		
		Double num1=inp.nextDouble();
		Double num2=inp.nextDouble();
		
		//calling method
		product(num1, num2);
		
	
	}
	
	public static void product(Double num1, Double num2) {
		

		Double result = num1*num2;

		System.out.println(result);
	}
	
}
