import java.util.*;
public class PolycarpRecoversThePermutation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			if(arr[0]!=n && arr[n-1]!=n) {
				System.out.println("-1");
			}else {
				for(int i=n-1;i>=0;i--) {
					System.out.print(arr[i]+" ");
				}
				System.out.println();
			}
		}
	}
}
