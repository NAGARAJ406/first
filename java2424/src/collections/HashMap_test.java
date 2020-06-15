package collections;

import java.util.HashMap;

public class HashMap_test
{
	public static void main(String[] args) {
	  
	   HashMap hm= new HashMap<Integer,String>();
	   hm.put(101,"nagaraj");
	   hm.put(102,"shiva");
	   hm.put(103,"nani");
	   System.out.println(hm);
	   hm.put("nani",125);//we can add num ant Objec to this 
	   System.out.println(hm);
	   
	}

}

