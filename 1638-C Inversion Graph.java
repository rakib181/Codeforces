import java.util.*;
public class InvGraph {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt(),max=0,ans=0;
			int[] arr=new int[n+1];
			for(int i=1;i<=n;i++) {
				arr[i]=sc.nextInt();
				max=Math.max(max, arr[i]);
				if(max==i) {
					ans++;
				}
			}
			System.out.println(ans);
		}
	}
}
