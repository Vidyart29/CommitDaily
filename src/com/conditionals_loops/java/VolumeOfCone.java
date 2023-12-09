package com.conditionals_loops.java;

import java.util.Scanner;

public class VolumeOfCone {
// volume = pi*r*r*(h/3)
	
	public static void main(String[] args) {
		System.out.println("enter radius and height: ");
		Scanner in = new Scanner(System.in);
		double pi= 3.14;
		float r = in.nextFloat();
		float h = in.nextFloat();
		
		System.out.println("volumn of cone is: "+ pi*r*r*(h/3));
		
	}
}
