package com.arrays.java;



public class RichestCustomerWealth {
	public static void main(String[] args) {
		int[][]accounts= {{1,2,3},{3,2,1}};
		int maxWealth=0;
		
		for (int i = 0; i < accounts.length; i++) {
			int sum=0;
			for (int j = 0; j < accounts[i].length; j++) {
				sum+= accounts[i][j];
				
			}
			maxWealth=Math.max(maxWealth, sum);
		}
		System.out.println("max wealth is... "+maxWealth);
		
	}
}
