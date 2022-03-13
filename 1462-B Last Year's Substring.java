/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class LastYearSubstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			String sb=sc.next();
			if(sb.equals("2020")|| sb.substring(n-4, n).equals("2020") || sb.substring(0, 4).equals("2020") || (sb.substring(0, 1).equals("2") && sb.substring(n-3,n ).equals("020")) || (sb.substring(0, 2).equals("20") && sb.substring(n-2, n).equals("20") ) || (sb.substring(0, 3).equals("202") && sb.substring(n-1, n).equals("0")) ) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
