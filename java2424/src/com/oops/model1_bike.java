package com.oops;

public class model1_bike extends bike{
    @Override
	 void run(int maxspeed) {
    	// TODO Auto-generated method stub
    	super.run(maxspeed);
    	//you can also add your own logic
    	
    System.out.println("your selected model1 bike will run with maxspeed"+maxspeed);
    }
    @Override
    void color(String str) {
    	// TODO Auto-generated method stub
    	//super.color(str);
    	//you can also add your own logic
    	System.out.println("your selected model1 bike aslo availble in"+str+"color");
    }

	@Override
	void mailage(int kms) {
		// TODO Auto-generated method stub
		//super.mailage(kms);
		//you can also add your own logic
		System.out.println("this bike will give "+kms+" kms of mailage aproximatly");
	}
	
}
