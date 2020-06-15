package collections.Design_pattrens;

public class Singleton_test_driver {
	public static void main(String[] args) {
		
		        Singleton_test obj = Singleton_test.getReferance();
				Singleton_test obj2 = Singleton_test.getReferance();
				System.out.println(obj.hashCode());
				System.out.println(obj2.hashCode());
	}

}
