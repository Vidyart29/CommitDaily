package com.conditionals_loops.java;

import java.util.Scanner;


//2. Calculate Electricity Bill
public class ElectricityBill {

	public static int calElectricityBill(int unit) {

		int totalElecBill=0;
		
		if (unit<=100) {
			totalElecBill= unit*10;
		} else if (unit<=200) {
			totalElecBill=(100*10)+(unit-100)*15;
		} else if (unit<=300) {
			totalElecBill= (100*10)+(100*15)+(unit-200)*20;
		} else if (unit>300) {
			totalElecBill=(100*10)+(100*15)+(100*20)+(unit-300)*25;
		} else {
			System.out.println("invalid output...");
		}
		return totalElecBill;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter unit consumed: ");
		int unit=input.nextInt();

		System.out.println("total electricity bill is: " +calElectricityBill(unit));
	
}
}
