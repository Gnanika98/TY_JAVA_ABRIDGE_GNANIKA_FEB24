package com.capgemini.assignment.day2;

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		String name;
		int age;
		long phoneno;
		String address;
		String email;
		System.out.println("Press 1 to Enter name");
		System.out.println("press 2 to enter age");
		System.out.println("press3 to enter phoneno");
		System.out.println("press 4 to enter address");
		System.out.println("press 5 to enter email");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		int h = scan.nextInt();
		for (int i = 1; i <= 5; i++) {
		System.out.println("Enter name");
		String s = scan.next();
		System.out.println("Enter age");
		int j = scan.nextInt();
		System.out.println("Enter phoneno");
		long l = scan.nextLong();
		System.out.println("Enter address");
		String m = scan.next();
		System.out.println("Enter email");
		String k = scan.next();
	}
}
}