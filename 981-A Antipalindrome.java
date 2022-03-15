/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class AntiPalindrome {
	public static boolean isPlaindrome(String sb) {
		String k="";
		for(int i=sb.length()-1;i>=0;i--) {
			k+=sb.charAt(i);
		}
		if(sb.equals(k)) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String sb=sc.next();int i=0,j=sb.length(),ans=0;
		while(j>=0) {
			String subs=sb.substring(i, j);
			if(isPlaindrome(subs)) {
				j--;
			}else {
				ans=subs.length();
				break;
			}
		}
		System.out.println(ans);
	}
}
