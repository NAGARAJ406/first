package com.ExceptionHandling;



public class TryWith_multy_catch {

	public static void main(String[] args) {
		try {
			int a =100;
			int b = 100/0;
		}
		catch(ArithmeticException ae) {
			//ae.printStackTrace();
			System.out.println("exception handld by catch block 1");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("exception handld by catch block 2");
		}
		finally {
			System.out.println("even the above catch bloks are not handeled i will terminate");
		}
		
	}
}
