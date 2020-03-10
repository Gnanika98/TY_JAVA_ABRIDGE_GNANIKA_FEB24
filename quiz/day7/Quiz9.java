package com.capgemini.quiz.day7;

public class Quiz9 {
		   public static void main(String args[]) {
			String str = "welcome";
			//negative index, method would throw exception
			char ch = str.charAt(-1);
			System.out.println(ch);
		   }
}//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -1
//at java.lang.String.charAt(Unknown Source)
//at com.capgemini.quiz.day7.Quiz9.main(Quiz9.java:7)

