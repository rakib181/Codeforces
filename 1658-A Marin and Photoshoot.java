import java.util.*;
public class MarinAndPhotoshoot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt(),cnt=0;
			StringBuilder sb=new StringBuilder(sc.next());
			for(int i=0;i<sb.length()-1;i++) {
				if(sb.charAt(i)=='0') {
					if(sb.charAt(i+1)=='0') {
						cnt+=2;
					}else if(i<n-2 && sb.charAt(i+2)=='0') {
						cnt+=1;
					}
				}
			}
			System.out.println(cnt);
		}
	}
}
