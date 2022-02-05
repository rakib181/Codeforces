import java.util.*;
public class SquareString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int x=0;x<t;x++) {
			String s=sc.next();
			List<Character>list1=new ArrayList<>();
			for(int i=0;i<s.length()/2;i++) {
				list1.add(s.charAt(i));
			}
			List<Character>list2=new ArrayList<>();
			for(int i=s.length()/2;i<s.length();i++) {
				list2.add(s.charAt(i));
			}
			if(list1.equals(list2)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
