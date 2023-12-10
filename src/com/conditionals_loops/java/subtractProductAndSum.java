package com.conditionals_loops.java;

import java.util.Scanner;

public class subtractProductAndSum {

	/* pseudo code aisa hoga somewhere..
	 * 
	 * n=12 (given by them..)
	 * return result
	 * where result is product of its digits(1*2) - and sum of its digits(1+2)
	 * i.e result = (1*2)-(1+2)
	 */
	public static void main(String[] args) {
		System.out.println("logic..");
		int n=234;
		
		String num= Integer.toString(n);
		int [] digit = new int[num.length()];
		System.out.println(digit);
		
	}
}
