import java.util.*;

public class TwoSubsequences {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String s=sc.next();
			char[] ch=s.toCharArray();
			Arrays.sort(ch);
			char ch1=ch[0];
			List<Character>list1=new ArrayList<>();
			List<Character>list2=new ArrayList<>();
			for(int j=0;j<s.length();j++) {
				list2.add(s.charAt(j));
			}
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)==ch1) {
					list1.add(s.charAt(i));
					list2.remove(i);
					break;
					
				}
			}
			for(Character y:list1) {
				System.out.print(y+" ");
			}
			for(Character x:list2) {
				System.out.print(x);
			}
			System.out.println();
		}
	}
}
