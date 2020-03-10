package com.capgemini.quiz.day4;

public class Quiz7 {

	private String function(String temp,int data,int sum) {
		return("Question_6");
	}
	private String function(String temp,int data) {
		return("This is Question_6");
	}
	public static void main(String[] args) {
		Quiz7 q=new Quiz7 ();
		System.out.println(q.function("Question_5", 0, 20));
	}
}
