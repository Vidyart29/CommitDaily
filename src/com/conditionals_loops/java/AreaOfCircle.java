package com.conditionals_loops.java;

import java.util.Scanner;

public class AreaOfCircle {

	
	public static void main(String[] args) {
		//pi*r*r
		System.out.println("area of circle logic");
		Scanner input = new Scanner(System.in);
		double pi=3.14;
		System.out.print("enter radius r: ");
		int r = input.nextInt();
		
		System.out.println("area of circle is: " + pi*r*r);
	}
}
