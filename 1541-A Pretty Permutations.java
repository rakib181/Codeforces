import java.util.*;

public class PrettyPermutations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
		    int[] arr=new int[n+1];
			for(int i=1;i<=n;i++) {
				arr[i]=i;
			}
			for(int i=1;i<n;i+=2) {
				int tmp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=tmp;
			}
			if((n&1)==1) {
				int tmp=arr[n-1];
				arr[n-1]=arr[n];
				arr[n]=tmp;
			}
			for(int i=1;i<=n;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
}
