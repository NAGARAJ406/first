package collections;

import java.util.LinkedHashSet;

public class Linked_Hashset {
	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("a");
		System.out.println(lhs);
		lhs.add(97);
		System.out.println(lhs);
		lhs.add(97);
	//	lhs.add(-97);
		System.out.println(lhs);
		//so this linkedhashset will not contains duplicates
		for(int i=0;i<=10;i++) {
			lhs.add(i);
			//lhs.add(97);
		}
		System.out.println(lhs);
		// iy will not  sort automatically so insertion is  preserved
		lhs.add(-97);
		System.out.println(lhs);
		
		
	}

}
