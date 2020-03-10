package com.capgemini.quiz.day6;

public class Quiz3 {
public void myMethod() {
	System.out.println("override method");
}
}
class Quiz31 extends Quiz3{
	public void myMethod() {
		super.myMethod();
		System.out.println("overriding method");
	}
	public static void main(String[] args) {
		Quiz31 q=new Quiz31();
		q.myMethod();
	}
}
