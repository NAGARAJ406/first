package collections;

import java.util.TreeSet;

public class TreeSet_Test {
public static void main(String[] args) {
	TreeSet ts = new TreeSet();
	ts.add(97);
	ts.add(1);
//	ts.add('t');//   it will allows only one data type if you want to add go with generic 
	System.out.println(ts);
	
	//tree is strong sorting map 
	
	for(int i=97;i<=111;i++) {
		ts.add(i);
	}
	//duplicates are not allowed
	System.out.println(ts);
//	for(char c='a';c<='i';c++) {
//		ts.add(c);
//	}
	System.out.println(ts);
	
	System.out.println(ts.pollFirst());//for first element
	System.out.println(ts.pollLast());//for last element
}
}
