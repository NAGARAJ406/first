package java2424.com.CLT;

public class new_var_args {
// for adading multy values with one method
	 static void add(int... a) {
		 int sum=0;
		System.out.println("length of passed param::"+a.length);
		for(int i=0;i<=a.length;i++) {
			sum =sum+a[i];
	
			System.out.println("value "+(i+1)+"is"+a[i]);
			System.out.println("added values"+sum);
		}
		System.out.println("added values"+sum);
	}
	
}
