package com.lti.main;

import java.io.ObjectInputStream.GetField;

import com.lti.model.BillValue;

public class Calc {
	public static void display(int val) {

		if (val < 100) {
			// scene1();
			System.out.println("The Total amount:" + val * 1.2);
		}

		else if (val <= 300) {
			int num = val - 100;
			double amt = 100 * 1.2;
			System.out.println("The Total amount:" + (amt + (num * 2)));
		}

		else if (val > 300) {
			int num = val - 300;
			double amt2 = 200 * 2.0;
			double amt1 = 100 * 1.2;
			System.out.println("The Total amount:" + (amt1 + amt2 + (num * 3)));

		}
	}

}
