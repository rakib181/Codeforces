import java.util.*;

public class Game {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt(),cnt=0,k=0;
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
				
			}
			for(int i=0;i<n;i++) {
				if(arr[i]==0) {
					k=i-1;
					break;
				}
			}
			for(int i=n-1;i>=1;i--) {
				if(arr[i]==0) {
					cnt=i+1;
					break;
				}
			}
			System.out.println(Math.abs(cnt-k));
		}
	}
}
