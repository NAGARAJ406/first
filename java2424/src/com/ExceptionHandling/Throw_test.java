package com.ExceptionHandling;

import java.util.Scanner;

public class Throw_test {
   //static ArithmeticException ae = new ArithmeticException();
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int age;
	   System.out.println("enter the age ");
	   age=sc.nextInt();
	   if(age<18) {
	   throw new ArithmeticException("you are not major ");
	   }
	   else {
		   System.out.println("please use your vote");
	   }
  }
}

