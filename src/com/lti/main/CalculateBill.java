package com.lti.main;

import java.util.Scanner;

import com.lti.model.BillValue;

public class CalculateBill {

	public static void main(String[] args) {
		value();
	}

	public static void value() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the units:");
		int val= sc.nextInt();
		BillValue bill= new BillValue(val);
		Calc calc = new Calc();
		calc.display(val);
		
	}
}
