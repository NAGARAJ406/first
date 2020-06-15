package collections;

import java.util.Vector;

public class vector_test {
public static void main(String[] args) {
	Vector v = new Vector();
	v.add("Clt");
	//this vector is a hydrogens so matter of daTA TYPES
	System.out.println(v);
	for (int i=0;i<=10;i++) {
		v.add(i);
		//to add in bulk way
	}
	System.out.println(v);
    System.out.println(v.capacity());
    for (int j=0;j<=20;j++) {
    	v.add(j);
    	//to know that vector size dynamically changes
    }
    System.out.println(v);
    System.out.println(v.capacity());
    //for present capacity of the vector
    System.out.println(v.hashCode());
    //for hash code of the vector
     //v.clear();
     // un comment last line  to clear the all data
     System.out.println(v);
     
}
}
