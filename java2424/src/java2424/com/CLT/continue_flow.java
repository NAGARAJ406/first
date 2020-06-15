package java2424.com.CLT;

public class continue_flow {
public static void main(String[] args) {
	for (int i=0;i<=30;i++) {
		//System.out.println(i);
		if(i==22) {
			continue;
		}
		System.out.println(i);
		//22 will miss in the line.
	}
}
}
