import java.util.*;
public class BracketSequenceDeletion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			String s=sc.next();
			char[] ch=s.toCharArray();
			int i=0,j=1,cnt=0;
			while(j<n) {
				if(ch[i]=='(') {
					cnt++;
					i=j+1;
					j+=2;
				}else {
					while(ch[j]!=')'&&j<n) {
						j++;
						if(j==n) {
							break;
						}
					}
					if(j<n) {
						cnt++;
						i=j+1;
						j+=2;
					}
				}
			}
			System.out.println(cnt+" "+(n-i));
		}
	}
}
