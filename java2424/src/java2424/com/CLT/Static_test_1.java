package java2424.com.CLT;

public class Static_test_1 {
	 int  sid ;
	String name  ;
static  String clg_name="CLT";

public Static_test_1 (int sid ,String name) {
	// TODO Auto-generated constructor stub
	this.sid=sid;
	this.name=name;	
}
void disply(){
	System.out.println(sid+"\t"+ name+"\t"+clg_name);
}
 
public static void main(String[] args) {
	Static_test_1 st1= new Static_test_1(101, "nagaraju");
	Static_test_1 st2= new Static_test_1(102, "shiva");
	st1.disply();
	st2.disply();
	
}
 
	
	
	 

}
