import java.util.*;

public class GettingZero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int x=sc.nextInt();
			if(x==0) {
				System.out.println("0");
			}else {
				int ans=1000000007;
				for(int i=0;i<=15;i++) {
					int TZ=Integer.numberOfTrailingZeros(x+i);
					ans=Math.min(ans, i+15-TZ);
				}
				System.out.println(ans);
			}
		}

	}

}
