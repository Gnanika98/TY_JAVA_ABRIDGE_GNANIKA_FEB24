package com.capgemini.quiz.day2;

public class Quiz4 {
	static int birthyear;
	static String birthname;
	public Quiz4(int year,String name) {
        birthyear=year;
		birthname=name;
	}
	public static void main(String[] args) {
		Quiz4 qu =new Quiz4(2000,"abc");
		System.out.println( "born in :"+birthyear+"  name is :"+birthname);
	}

}
