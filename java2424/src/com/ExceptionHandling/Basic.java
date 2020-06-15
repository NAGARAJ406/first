package com.ExceptionHandling;

import java.util.concurrent.ExecutionException;

public class Basic {
	public static void main(String[] args) {
		try {
			int x=10;
			int y = 10/0;
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("excepton handeled by the catch");
			
		}
		System.out.println("this is how handel the exception i simple way");
	}

}
