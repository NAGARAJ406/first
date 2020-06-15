package collections.Design_pattrens;

public class Singleton_test {
	  private static    Singleton_test st ; 
    private Singleton_test() {
    	
    }
    
    public static Singleton_test getReferance() {
    	 if(st==null) {
    		 st= new Singleton_test();
    	 }
    	
    	return st;
    }
}
