package com.functions.java;

import java.util.Scanner;

public class sumOfN {

	private static int findSum(int n) {
		// TODO Auto-generated method stub

		int sum=0;
		for (int i = 1; i <=n; i++) {
			sum+=i;
			
		}
		return sum;
	}
	public static void main(String[] args) {
		
		
		System.out.println("enter n: ");
		Scanner inp=new Scanner(System.in);
		int n=inp.nextInt();
		System.out.println(findSum(n));
	}
}
