package com.oops;

public class this_test1_driver  extends This_test1{
	// example of the variable shadowing 
	int X = 30 ;
	int Y = 40;
	void m2() {
		System.out.println("x::"+x);
		System.out.println("y::"+y);
		
		System.out.println("x::"+super.x);
		System.out.println("x::"+super.y);
		
		}
	void m3(){
		int x =50 ;
		int y = 60;
		System.out.println("local ..x"+x);
		System.out.println("local ...y"+y);
		
		System.out.println(" sub-class x::"+this.x);
		System.out.println(" sub-class y::"+this.y);
		
		System.out.println(" sub-class x::"+super.x);
		System.out.println(" sub-class y::"+super.y);
		
		
	}
	public static void main(String[] args) {
		this_test1_driver ttd = new this_test1_driver();
		
		ttd.m2();
		ttd.m3();
	}
	
}
