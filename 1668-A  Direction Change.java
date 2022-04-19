import java.util.*;
public class DC {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt(),m=sc.nextInt(),ans=0;
			if(n<m) {
				n^=m;m^=n;n^=m;
			}
				ans=n+m-2;
			if((n-m)>1 && m<2) {
				ans=-1;
			}else {
				ans+=(n-m>>1)<<1;
			}
			System.out.println(ans);
		}
	}
}
