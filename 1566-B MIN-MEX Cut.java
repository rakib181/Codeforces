import java.util.*;
public class MinMexCut {
	static boolean letsTry(char[] ch,int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=(ch[i]-'0');
		}
		if(sum==n) {
			return true;
		}
		return false;
	}
	static boolean consequtive(char[] ch,int k,int n) {
		int cnt=0;
		for(int i=0;i<n;i++) {
			if(ch[i]=='0') {
				cnt++;
				if(i<n-1) {
					if(ch[i+1]!='0') {
						break;
					}
				}
			}
		}
		if(cnt==k) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String s=sc.next();
			char[] ch=s.toCharArray();int cnt=0,n=ch.length;
			for(int i=0;i<n;i++) {
				if(ch[i]=='0') {
					cnt++;
				}
			}
			if(letsTry(ch,n)) {
				System.out.println("0");
			}else if(consequtive(ch,cnt,n)) {
				System.out.println("1");
			}else {
				System.out.println("2");
			}
		}	
	}
}
