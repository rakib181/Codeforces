/*----->Hope Can Set You Free<-----*/
import java.util.*;

public class XORwice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
		int a=sc.nextInt(),b=sc.nextInt();
		if(a>=b) {
			System.out.println(a^b);
		}else {
			System.out.println(b^a);
		}
		}
	}

}
