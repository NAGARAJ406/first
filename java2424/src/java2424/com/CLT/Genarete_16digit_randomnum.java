package java2424.com.CLT;

import java.util.Random;

public class Genarete_16digit_randomnum {
//	
//	public static void main(String[] args) {
//		
//		//first approch
//		long num = (long) (Math.random() * (2345000000000000l));
//		System.out.println(num);
//		//2nd aproch
//		Random r1= new  Random();
//		
//	}


	public static void main(String[] args) {
        System.out.println(generateRandom(52));
    }
	
	
    public static long generateRandom(int prefix) {
        Random rand = new Random();
        long x = (long)(rand.nextDouble()*100000000000000L);
        String s = String.valueOf(prefix) + String.format("%014d", x);
        return Long.valueOf(s);//5209298206734432
    }
}


