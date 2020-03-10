package com.capgemini.quiz.day5;

public class Quiz6 {
	public void method1() {
		System.out.println("method1 is the parent class");
	}
}

class Quiz62 extends Quiz6 {
	public void method1() {
		System.out.println("method1 is now a child class");
	}

	public void newMethod() {
		System.out.println("new method of child class");
	}
}
