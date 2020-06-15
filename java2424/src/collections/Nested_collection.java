package collections;

import java.util.ArrayList;

public class Nested_collection {
	public static void main(String[] args) {
		ArrayList<ArrayList<String>> al= new ArrayList<ArrayList<String>>();
		
		ArrayList<String> al1= new ArrayList<String>();
		al1.add("clt");
		al1.add("hyd");
		al1.add("123");
		al1.addAll(al1);
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("nani");
		al2.addAll(al1);
		System.out.println(al);
		System.out.println(al1);
		System.out.println(al2);
		al.add(al2);
		System.out.println(al);
	}

}
