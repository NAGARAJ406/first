package java2424.com.CLT;

public class REcorsive_in_java {
    // it will gives stack overflow error
	 static void recall(){
		System.out.println("this is re call method");
		recall();
	}
	public static void main(String[] args) {
		recall();
	}
}
