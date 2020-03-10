package com.capgemini.quiz.day6;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		int num;
		System.out.println("enter an integer number");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		if (num1 % 2 == 0)
			System.out.println("enter num is even");
		else
			System.out.println("enter num is odd");
	}
}
