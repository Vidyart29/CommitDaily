package com.conditionals_loops.java;

import java.util.Scanner;

/* 25. Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August. */
public class CountEvenDays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("enter n");
		
		Scanner input= new Scanner(System.in);
		int n=input.nextInt();
		int count=0;
		for (int i = 0; i <=n; i++) {
			if (i%2==0){
				System.out.println("even day: "+i);
				count++;
			}
//			else {
//				System.out.println("odd days");
//			}
			
		}
		System.out.println("total even days count is: "+ count);
				
	}
	
}
