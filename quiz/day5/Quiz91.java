package com.capgemini.quiz.day5;

public class Quiz91 implements Quiz9,Quiz92{
	public static void main(String[] args) {
	    //system.out.println(x);//reference of x is ambiguous bcz both variables are x
		//so we r using interface name to resolve variable
		System.out.println(Quiz92.x);
		System.out.println(Quiz9.x);
	}

}
