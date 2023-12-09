package com.conditionals_loops.java;

import java.util.Scanner;

public class AreaOfRectangle {
// rectangle = l*b
	
	public static void main(String[] args) {
		System.out.println("enter lenght and breadth.....");
		Scanner in = new Scanner(System.in);
		float lenght = in.nextFloat();
		float breadth = in.nextFloat();
		
		System.out.println("Area of rect.. is "+ lenght*breadth);
	}
}
