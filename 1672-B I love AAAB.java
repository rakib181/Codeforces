import java.util.*;
public class ILAAAB {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String s=sc.next();
			char[] ch=s.toCharArray();int n=ch.length,a=0,b=0;
			if(n==1) {
				System.out.println("NO");
			}else {
				for(int i=0;i<n;i++) {
					if(ch[i]=='A') {
						a++;
					}else {
						b++;
					}
					if(a<b) {
						break;
					}
				}
				System.out.println(a>=b && ch[n-1]!='A' && ch[0]!='B' ? "YES" : "NO");
			}
		}
	}
}
