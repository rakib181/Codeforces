/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class JugglingLetters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt(),flag=0;
			StringBuilder sb1=new StringBuilder();
			for(int i=0;i<n;i++) {
			StringBuilder sb=new StringBuilder(sc.next());
			sb1.append(sb);
			}
		char[] ch=(sb1.toString()).toCharArray();
		Map<Character,Integer>mp=new HashMap<>();
		for(int i=0;i<sb1.length();i++) {
			if(mp.containsKey(ch[i])) {
				mp.put(ch[i], mp.get(ch[i])+1);
			}else {
				mp.put(ch[i], 1);
			}
		}
		for(char key:mp.keySet()) {
			if(mp.get(key)%n !=0) {
				flag=1;break;
			}
		}
		if(flag==1) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		   }
		}
	}
}
