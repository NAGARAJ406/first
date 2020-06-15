package com.logical;

import java.util.Scanner;

public class prime_nums {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("give the  number to test");
		int num = Sc.nextInt();
		
		if(num%2==0){
		System.out.println("The given number is even number");	
		}
		
		else if(num%3==0) {
			System.out.println("The given number is odd number");
		}
		
		else {
			System.out.println("The given number is prime number");
		}
	}
	

}
