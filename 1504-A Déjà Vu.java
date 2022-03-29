import java.util.*;
public class DejaVu {
	static boolean isPalindrome(String s) {
		int i=0,n=s.length();
		char[] ch=s.toCharArray();
		while(i<n) {
			if(ch[i]!=ch[n-i-1]) {
				return false;
			}
			i++;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String s=sc.next(),k=s+'a',p='a'+s;
			if(!isPalindrome(k)) {
				System.out.println("YES"+"\n"+k);
			}else if(!isPalindrome(p)) {
				System.out.println("YES"+"\n"+p);
			}else {
				System.out.println("NO");
			}
		}
	}
}
