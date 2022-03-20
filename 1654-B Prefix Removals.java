import java.util.*;

public class PrefixRemovals {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			Map<Character,Integer>mp=new HashMap<>();
		StringBuilder sb=new StringBuilder(sc.next());
		for(int i=0;i<sb.length();i++) {
			if(!mp.containsKey(sb.charAt(i))) {
				mp.put(sb.charAt(i), 1);
			}else {
				mp.put(sb.charAt(i), mp.get(sb.charAt(i))+1);
			}
		}
		int k=0;
		for(int i=0;i<sb.length();i++) {
			if(mp.get(sb.charAt(i))>1) {
				k++;
              mp.put(sb.charAt(i),mp.get(sb.charAt(i))-1);
			}else {
			break;
			}
		}
		System.out.println(sb.substring(k));
	}
  }
}
