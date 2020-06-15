package com.ExceptionHandling;

public class Thows_test {

	public static void main(String[] args) throws ArithmeticException //it will pass the exception to the parent class if no exception handling it will shows error again
	{
		int x=10;
		try {
		int y =x/0;
		//System.out.println(y);
		}
		catch(ArithmeticException ae){
			ae.printStackTrace();
		}
			
	}
}
