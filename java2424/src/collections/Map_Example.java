package collections;

import java.util.HashMap;
  
public class Map_Example {
	public static void main(String[] args) {
		HashMap<Integer, String>  hm = new HashMap<Integer, String>();
		hm.put(101, "nagaraj");
		hm.put(102,"CLT");
		hm.put(103,"hyd");
		System.out.println(hm.hashCode());
		
		
		hm.forEach((n,s) -> System.out.println(n+" : "+s));
		//hm.forEach((n,s) -> System.out.println(n+" : "+s));

		//hm.forEach();
		//hm.forEach((key,value) -> System.out.println(key+" : "+value));
		
	}

}
