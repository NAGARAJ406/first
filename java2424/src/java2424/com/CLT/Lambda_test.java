package java2424.com.CLT;

import java.util.ArrayList;
import java.util.List;

public class Lambda_test {
   // lambda for the displaying all elements in array
	public static void main(String[] args) {
		List<Object> l = new ArrayList<Object>();
		l.add("nagaraju");
		l.add("nani");
		l.add("clt");
		l.add("Siva nagaraju");
		l.forEach((n)->System.out.println(n));
		{
			
		}
	}

}
