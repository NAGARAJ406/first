package java2424.com.CLT;

public class LeapYear_app {
	public static  void is_it_leap(int year) {
		
		if(year%4==0) {
			System.out.println("the given year is leap year");
			
			 if(year%100!=0) {
				System.out.println("the given year is leap year");
			}
			 else if(year%400==0) {
					System.out.println("the given year is leap year");
				}
		}
		
			else {
			System.out.println("the given year is not a leap year");
		}
	}
	public static void main(String[] args) {
		
		is_it_leap(2020);
		is_it_leap(1997);
	}

}
