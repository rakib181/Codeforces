/*----->Hope Can Set You Free<-----*/
import java.util.*;

public class YetAnotherStringGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
		StringBuilder sb=new StringBuilder(sc.next());
		for(int i=0;i<sb.length();i++) {
			if((i&1)==0) {
				if(sb.charAt(i)=='a') {
					sb.setCharAt(i, 'b');
				}else {
					sb.setCharAt(i, 'a');
				}
			}else {
				if(sb.charAt(i)=='z') {
					sb.setCharAt(i, 'y');
				}else {
					sb.setCharAt(i, 'z');
				}
			}
		}
		System.out.println(sb);
		}

	}

}
