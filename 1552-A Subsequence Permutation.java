/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt(),cnt=0;
			StringBuilder sb=new StringBuilder(sc.next());
			char[] ch=(sb.toString()).toCharArray();
			Arrays.sort(ch);
			for(int i=0;i<n;i++){
				if(sb.charAt(i)!=ch[i]){
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}
