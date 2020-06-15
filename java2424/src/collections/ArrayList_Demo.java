package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Demo {
	public static <E> void main(String[] args) {
		ArrayList<Comparable>  ar = new ArrayList<Comparable>();
		ar.add("CLT");
		System.out.println(ar);
	
		for(int i=0;i<=10;i++) {
			//now we add bulk values to array list
			ar.add(i);
			
		}
		System.out.println(ar);
		ar.add(95811933);
		System.out.println(ar);//see the changes
		ar.add(0211.20);
		ar.add((int)'a');//casting also will work here 
		System.out.println(ar);
		ar.add(9,9999);//add where ever you want
		System.out.println(ar);
		System.out.println(ar.contains(2));// boolean output
		System.out.println(ar);
		
		ar.remove(3);
		System.out.println(ar);//to remove the single 
		Iterator it=ar.iterator(); 
		
			while(it.hasNext()) {
				System.out.println(it.next());
		}
		
		
		


		
	}

}
