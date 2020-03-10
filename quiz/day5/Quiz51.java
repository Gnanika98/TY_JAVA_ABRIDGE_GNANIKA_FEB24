package com.capgemini.quiz.day5;

public class Quiz51  extends Quiz5{
public void eat() {
	System.out.println("man is eating");
}
public static void main(String[] args) {
	Quiz51 q=new Quiz51();//sub class obj must be created in case of overriding to get only sub class
	//info
	q.eat();
}
}
