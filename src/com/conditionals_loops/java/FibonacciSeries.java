package com.conditionals_loops.java;

public class FibonacciSeries {
	/*
	 * 0 1 1 2 3 5 8 13...
	 * 
	 * preceding_no1 + preceding_no2 = next_no
	 * 
	 * 0+1 =1 1+1=2 2+1=3 3+2=5 5+3=8 8+5=13
	 */
	
	public static void main(String[] args) {
		System.out.println("fibonacci series..");
		System.out.println("0 and 1 are already there..");
		
		int n1, n2, n3;
	
		n1=0;
		n2=1;
		for (int i = 2; i <= 12; i++) {
			n3=n1+n2;
			System.out.print(" "+ n3 +"  ");
			n1=n2;
			n2=n3;
			
			
		}
	}
}
