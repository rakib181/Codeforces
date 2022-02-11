import java.util.*;

public class MirrorInTheString {
	void solve() {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++) {
			int n=sc.nextInt();
		String s=sc.next();
		List<Character>list=new ArrayList<>();
		list.add(s.charAt(0));
		for(int i=1;i<s.length();i++) {
			if(((s.charAt(i-1)==s.charAt(i)) && i>1) || s.charAt(i-1)>s.charAt(i)) {
				list.add(s.charAt(i));
			}else {
				break;
			}
		}
		for(Character c:list) {
		System.out.print(c);
		}
		Collections.reverse(list);
		for(Character x:list) {
			System.out.print(x);
		}
		System.out.println();
		}
		
	}
	public static void main(String[] args) {
		MirrorInTheString obj=new MirrorInTheString();
		obj.solve();
	        	
	}
}
