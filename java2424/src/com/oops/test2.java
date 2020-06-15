package com.oops;

public class test2 extends test1 {
	static int a = 50;
	int  x = 60;
	static void m1() {
		System.out.println("m1 from test 2");
	}
	void m2 () {
		System.out.println("m2 from test 2");
	}
	public static void main(String[] args) {
		System.out.println("a::"+a);
		m1();
		test2 t2 = new test2();
		System.out.println("x::"+t2.x);
		t2.m2();
		t2.m1();
	}

}
