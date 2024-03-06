package com.conditionals_loops.java;



//Reverse A String In Java
public class ReverseNo {

	public static void main(String[] args) {
		
		System.out.println("reverse a nos");
		
		
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
