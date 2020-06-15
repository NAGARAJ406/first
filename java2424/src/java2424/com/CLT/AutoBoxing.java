package java2424.com.CLT;

public class AutoBoxing {
	

	 public static void m1(Integer num) {
		int  num1 = (int) num;
		int num2 = (int)num+ num1;
		System.out.println("added Integer "+num2);
	 }
	 public static void m1(int y) {
		 System.out.println("this is int method"+y);
	 }
	 public static void m1 (Long l1){
		  System.out.println(" this is LOng method "+l1);
	 }
	 public static  void m1(Character c) {
		 System.out.println("this is char method "+c);
	 }
	 public static void m1(Number n) {
		 System.out.println("Number method "+n);
	 }
	 public static void m1(Double d) {
		 System.out.println("this is Double method"+d);
	 }
	 public static void m1(Object o) {
		 System.out.println("this is Object method"+o);
	 }
	 public static void m1(char ch) {
		 System.out.println("this is from char method"+ch);
	 }
	 
	 
	 
	 
	 
	 public static void main(String[] args) {
	    m1(50);
	    m1(new Integer(50));
	    m1(100);
	    m1('a');
	    m1(new Character ('a'));
	    m1(new Integer (1254));
	    m1(50);
	    m1('a');
	    m1("nagaraj");
	    m1('b');
	    m1(127);
	    m1(2.54);
	    m1(95213548965L);
	    m1(0.2);
	    m1(true);
	    
	 	    

	}
}