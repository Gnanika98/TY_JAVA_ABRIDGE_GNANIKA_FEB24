package com.capgemini.quiz.day6;

public class Quiz1 {
	int num = 100;
}

class Quiz12 extends Quiz1 {
	int num = 110;

	void printNumber() {
		System.out.println(num);
	}

	public static void main(String[] args) {
		Quiz12 q = new Quiz12();
		q.printNumber();
	}
}