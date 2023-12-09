package com.conditionals_loops.java;

import java.util.Scanner;

public class AreaOfTriangle {
// A=(1/2)*b*h
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter base and height: ");
		double base = input.nextDouble();
		double height = input.nextDouble();
		
		System.out.println("area of triangle is: " + 0.5*base*height);
		
	}
}
