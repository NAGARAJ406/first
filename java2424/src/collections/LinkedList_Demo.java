package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Demo {
public static void main(String[] args) {
	LinkedList<Object> ll =new LinkedList<Object>();
	ll.add(1);
	ll.add("nani");
	System.out.println(ll);
	
	System.out.println(ll);
	ll.add('a');
	ll.add(3,"nagaraj");
	System.out.println(ll);
	for (int i=0;i<=10;i++) {
		ll.add(i);
	}
	System.out.println(ll);
	ll.add("$%^");
	ll.add((int)'*');//casting 
//	System.out.println(ll);
//	Iterator itr=ll.iterator();
//	while(itr.hasNext()) {
//		System.out.println(itr.next());
//	}
	
	
	//System.out.println(ll.peek());
	
	
	Iterator itr1=ll.descendingIterator();
	while(itr1.hasNext()) {
		System.out.println(itr1.next());
	}
}
}
