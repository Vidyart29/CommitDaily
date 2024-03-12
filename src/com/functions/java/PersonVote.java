package com.functions.java;

import java.util.Scanner;

// a person can vote if age>=18
public class PersonVote {

	public static void main(String[] args) {
		System.out.println("enter age: ");
		Scanner input= new Scanner(System.in);
		int age=input.nextInt();
		
		
		vote(age);
		
	}
	
	public static void vote(int age) {
		
		if (age>=18){
			System.out.println("eligible to vote");
		}
		else {
			System.out.println("not eligible to vote");
		}

	}
}
