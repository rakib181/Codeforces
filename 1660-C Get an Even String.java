import java.util.*;
public class GetAnEvenString {
  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String s=sc.next();
			char[] ch=s.toCharArray();int ans=s.length(),n=s.length();
			Map<Character,Integer>mp=new HashMap<>();
			for(int i=0;i<n;i++) {
				if(!mp.containsKey(ch[i])) {
					mp.put(ch[i], 1);
				}else {
					ans-=2;
					mp.clear();
				}
			}
			System.out.println(ans);
		}
	}
}
