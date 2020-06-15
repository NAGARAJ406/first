package java2424.com.CLT;

import java.util.Scanner;

public class if_else {
  public static int age ;
  public static int teen= 13 ;
  public int adult =18 ;
  public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("enter the age ");
	   age = sc.nextInt();
	   if (age <= teen) {
		   System.out.println("the given age group is under the teen");
	   }
	   else {
		   System.out.println("the given age group is under the adult");
	   }
}
}
