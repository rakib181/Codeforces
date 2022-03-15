/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class Hotelier {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
			StringBuilder yo=new StringBuilder("0000000000");
			StringBuilder sb=new StringBuilder(sc.next());
			for(int i=0;i<sb.length();i++) {
				if(sb.charAt(i)=='L') {
					for(int j=0;j<yo.length();j++) {
						if(yo.charAt(j)=='0') {
							yo.setCharAt(j, '1');
							break;
						}
					}
				}else if(sb.charAt(i)=='R') {
					for(int k=yo.length()-1;k>=0;k--) {
						if(yo.charAt(k)=='0') {
							yo.setCharAt(k, '1');
							break;
						}
					}
				}else {
					yo.setCharAt(Character.getNumericValue(sb.charAt(i)), '0');
				}
			}
			System.out.println(yo);
		}
}
