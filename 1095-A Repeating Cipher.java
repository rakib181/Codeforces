/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class RepeatingCipher {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		StringBuilder sb=new StringBuilder(sc.next());
		StringBuilder sb1=new StringBuilder();
        for(int i=0,k=2;i<sb.length();i+=k-1) {
        	sb1.append(sb.charAt(i));
        	k++;
        }
        System.out.println(sb1);
	}

}
