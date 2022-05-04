import java.util.*;
public class PalBasis {
	static int N=40000,MOD=1000000007;
	static long[] dp=new long[N+1];
	static void init() {
	    dp[0]=1;
	    for(int i=1;i<=N;i++) {
	    	if(isPal(i)) {
	    		for(int j=i;j<=N;j++) {
	    			dp[j]=(dp[j]+dp[j-i])%MOD;
	    		}
	    	}
	    }
	}
	static boolean isPal(int x) {
		String s=String.valueOf(x),str=s,ans="";
		char[] ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			ans+=ch[i];
		}
		if(s.equals(ans)) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		init();
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			System.out.println(dp[n]);
		}
	}
}
