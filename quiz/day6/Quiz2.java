package com.capgemini.quiz.day6;

public class Quiz2 {
	Quiz2() {
		System.out.println("no argu constructor");
	}

	Quiz2(String s) {
		System.out.println("parameters constructor");
	}
}

class subClass extends Quiz2 {
	subClass() {
		super("HAHAHA");
		System.out.println("constructor of Quiz2 with argu");

	}

	void display() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		subClass q = new subClass();
		q.display();
	}
}