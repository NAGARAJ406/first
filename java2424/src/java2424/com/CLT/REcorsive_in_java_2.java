package java2424.com.CLT;

public class REcorsive_in_java_2 {
	//putting limits to the recursive  methods
     static  int count  ;
	 public static  void recall( ){
		count++;
		if(count<=1000) {
			System.out.println("the num"+count);
		}
		recall();
	}
	 public static void main(String[] args) {
		recall();
	}
}
