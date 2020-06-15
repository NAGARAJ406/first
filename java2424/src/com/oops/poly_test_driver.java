package com.oops;

public class poly_test_driver extends poly_test {
     void m1 () {
    	 System.out.println("sample m1");
     }
     void m2() {
    	 System.out.println("sample m2");
     }
     void m4(String str) {
    	 System.out.println("string param");
    	 
     }
     public static void main(String[] args) {
		poly_test_driver  p1 = new poly_test_driver();
		p1.m1();
		p1.m2();
	    p1.m3();
        p1.m4();
		p1.m4("nani");
		
		poly_test p2 = new  poly_test_driver();
		p2.m1();
		p2.m2();
		p2.m3();
		//p2.m4("nag");
		p2.m4();
		
	}
}
