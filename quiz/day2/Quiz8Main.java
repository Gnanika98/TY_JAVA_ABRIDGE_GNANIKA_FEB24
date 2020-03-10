package com.capgemini.quiz.day2;

public class Quiz8Main {
public static void main(String[] args) {
	Quiz8 qu=new Quiz8();
	Quiz8 q=new Quiz8();
	qu.x=0;
	qu.y=0;
	qu.result(3, 7);
	System.out.println("************");
	q.x=0;
	q.result(8, 4);
	System.out.println(qu.x+" "+q.y);
	
}
}/* 3  11*/
