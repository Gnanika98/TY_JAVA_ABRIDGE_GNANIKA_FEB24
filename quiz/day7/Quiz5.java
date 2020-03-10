package com.capgemini.quiz.day7;

public class Quiz5 {
	public static void main(String[] args) {
		int[] b1= new int[-4];
		b1[0] = 10;//b[-0] same exception repeats
		b1[1] = 20;
		b1[2] = 30;
		b1[3] = 40;
		System.out.println(b1[0]);
		System.out.println(b1[1]);
		System.out.println(b1[2]);
		System.out.println(b1[3]);
		//for (int i = 1; i < 4; i++) {
			//System.out.println(b1[i]);
		System.out.println("***********");
		System.out.println("size of b- "+b1.length);
	}
}//Exception in thread "main" java.lang.NegativeArraySizeException
//at com.capgemini.quiz.day7.Quiz5.main(Quiz5.java:5)

