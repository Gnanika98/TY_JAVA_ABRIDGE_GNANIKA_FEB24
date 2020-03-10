package com.capgemini.quiz.day4;

	interface Quiz1
	{
	   void method1();//abstract methods, so imple must be presented in subclass
	   void method2();
	}
	class Demo implements Quiz1//this cls will implement the abstract methods
	{
	  public void method1()
	   {
		System.out.println("implementation of method1");
	   }
	   public void method2()
	   {
		System.out.println("implementation of method2");
	   }
	 
	}


