import java.util.*;

public class GregorAndThePawnGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt(),ans=0;
			String F=sc.next(),L=sc.next();
			char[] F1=F.toCharArray();
			char[] L1=L.toCharArray();
			for(int i=0;i<n;i++) {
				if(F1[i]=='0' && L1[i]=='1') {
					ans++;
				}else if(i>0 && F1[i-1]=='1' && L1[i]=='1') {
					ans++;F1[i-1]='0';
				}else if(i<n-1 && F1[i+1]=='1' && L1[i]=='1') {
					ans++;F1[i+1]='0';
				}
			}
			System.out.println(ans);
		}
	}
}
