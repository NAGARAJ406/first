package java2424.com.CLT;

import java.util.Arrays;

public class Printing_Array {

	public static void main(String[] args) {
		int[] num= {10,2,05,05,0,2,0,5,5,0,};
		for(int i=0;i<num.length;i++) {
			System.out.println(">> in place of "+i);
						System.out.println("..ayrray hava data as "+num[i]);
			
		}
		System.out.println("  \t\t\t\t"+Arrays.toString(num));
	}
}
