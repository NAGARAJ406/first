package java2424.com.CLT;

public class Casting_of_datatypes {
public static void main(String[] args) {
	int i =2;
	System.out.println(i);
	char ch = (char)12;
	System.out.println(ch);
	char h51 = 'n';
	System.out.println(ch);
	//byte,short,int ,long,float and double .
    byte b1=2; 
    
    System.out.println(b1);
    
    byte b2=1;
    
    System.out.println(b2);
    
    float f = 20.00F;
    double d = 10.00;
    
   //float f1=d; this will leads to error
    double d2=f; //down casting
    
    System.out.println(d2);
    
    float f1= (float)d;//up casting
    
    System.out.println(f1);
    
    
    int i1 =97;
    char a =(char)i1;
    
    System.out.println(a);
    
    char ch2=' ';
    int i2=(int)ch2;
    
    System.out.println(i2);
    short sh1 = 25;
    byte b3 = (byte)sh1;
    System.out.println(b3);
    byte b4=(byte)a;
   System.out.println(b4);
   
    
}

}
