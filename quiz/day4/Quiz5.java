package com.capgemini.quiz.day4;

public class Quiz5 {
	private String function(float i, int f) {
		return ("Question_5");
	}

	private String function(double i, double f) {
		return ("This is Question_4");
	}

	public static void main(String[] args) {
		Quiz5 q = new Quiz5();
		System.out.println(q.function(1., 20));
	}
	}
