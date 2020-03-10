package com.capgemini.quiz.day3;

public class Quiz2 {
	int x = 2;

	Quiz2(int i) {
		x = i;
	}

	public static void main(String[] args) {
		Quiz2 q = new Quiz2(4);
		System.out.println("x is : " + q.x);
	}
}
