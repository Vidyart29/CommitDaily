package com.conditionals_loops.java;

import java.util.Scanner;

//Reverse A String In Java
public class ArrayListProgram {

	public static void main(String[] args) {
		
		System.out.println("reverse a nos");
		
//		Scanner inp = new Scanner(System.in);
//		int num=inp.nextInt();
		
		int num=567890;
		int ans = 0;
		
		while (num>0) {
			int rem =num%10;
			num=num/10;
			
			ans= ans*10 + rem;
			
		}
		System.out.println(ans);
	}
	

}
