package com.functions.java;

public class Scope {
	/*
	 * public static void main(String[] args) { int a; a=10;
	 * System.out.println("value before the block "+a); {
	 * 
	 * a=11; System.out.println("value of a: "+ a); }
	 * System.out.println("value outside of block: "+ a);
	 * 
	 * 
	 * }
	 */
	public static void main(String[] args) {
		int a=10;
		System.out.println("value of block before "+a );
		
	}
}
