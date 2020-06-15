package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_test {
	public static void main(String[] args) {
		Deque<Object> d = new ArrayDeque<Object>();
		d.add("A");
		System.out.println(d);
		for (int i=0;i<=10;i++) {
			d.add(i);
		}
		System.out.println(d);
		d.offer("nani");
		System.out.println(d);//to offer the object to queue	
		d.offerFirst("nani");//to at first place
		System.out.println(d);
		System.out.println(d.getFirst());
		System.out.println(d.getLast());
		System.out.println(d.poll());//we call also use pollFirst();,pollLast();
		
		
	}

}
