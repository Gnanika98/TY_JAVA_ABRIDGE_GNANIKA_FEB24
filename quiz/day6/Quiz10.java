package com.capgemini.quiz.day6;
import java.util.Scanner;
public class Quiz10 {//FINDING FACTORIAL ACCORDING TO USER GIVEN INFORMATION USING SCANNER CLASS

    public static void main(String[] args) {

    	//We will find the factorial of this number
        int number;
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();
        long fact = 1;
        int i = 1;
        while(i<=number)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
