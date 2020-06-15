package com.oops;

public class super_test2 extends super_test1 {
	static int a=50;
	int x = 60;
	static void m1() {
		//super.m1();
		System.out.println("m1 from test class");
	}
	void m2() {
		System.out.println("m2 from test class");
		
		super.m2();
	}
	void m4() {
		System.out.println("m4 from test class");
		System.out.println("super class a:"+super.a);
		System.out.println("super class a:"+super.x);
		super.m1();
		m1();
		super.m2();
		m2();
		
	}
	public static void main(String[] args) {
		super_test2 st2= new super_test2();
		st2.m4();
		
	}

}
