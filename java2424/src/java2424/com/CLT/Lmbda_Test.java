package java2424.com.CLT;

public class Lmbda_Test {

	public static void main(String[] args) {
		Addition ad= (a,b,c)->((a+b)/c);
		//Addition ad2= (a,b,c)->((a*b)/c);
		
		
		System.out.println(ad.add(10,20,30));
		System.out.println(ad.add(20,30,40));
		System.out.println();
		
		//System.out.println(ad2.add(102,206,2));
		//System.out.println(ad2.add(1001,2002,3));
		
	}
} 
