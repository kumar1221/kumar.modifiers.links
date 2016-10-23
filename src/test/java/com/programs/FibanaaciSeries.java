package com.programs;

import java.util.Scanner;

public class FibanaaciSeries {

	public int n1 = 0, n2 = 1, n3, num;
	Scanner in;

	public static void main(String[] args) {

		FibanaaciSeries c = new FibanaaciSeries();
		c.vowelCount();
	}

	public void vowelCount() {

		System.out.println("Enter the number ");
		in = new Scanner(System.in);
		num = in.nextInt();

		System.out.print(n1 + " " + n2);

		for (int i = 2; i < num; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}
}
