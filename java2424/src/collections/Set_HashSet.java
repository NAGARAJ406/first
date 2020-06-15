package collections;

import java.util.HashSet;
import java.util.Iterator;

//HashSet stores the elements by using a mechanism called hashing.
//HashSet contains unique elements only.
//HashSet allows null value.
//HashSet class is non synchronized.
//HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
//HashSet is the best approach for search operations.
//The initial default capacity of HashSet is 16, and the load factor is 0.75.
public class Set_HashSet {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add("clt");//first element in hashset
		
		System.out.println(hs.hashCode());//to see hash code of the first element in the "hs"
		
		hs.clear();
		hs.add(97);
		System.out.println(hs);//see empty hs(variable of hashset)
		
		// now i will add bulk chars to hashset 
		for(char c ='a'; c<='z';c++) {
			hs.add(c);
		}
		System.out.println(hs);
		hs.add(97);
		System.out.println(hs);
		hs.add(97);
		System.out.println(hs);
		// see i added 97 for 3 times but it will displaying only "one" time
		
	//now see iteration with hashmap
		Iterator itr=hs.iterator();
		while(itr.hasNext()) {
			//content
			System.out.println(itr.next());
			//hash code of the content
			//System.out.println(itr.hashCode());
			
		}
		//automatically sorting so insertion is not preserved
		hs.add(-97);
		System.out.println(hs);
		
	}
}
