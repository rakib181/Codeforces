import java.util.*;
public class VladAndCandies {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int [] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			if(n==1) {
				if(arr[0]<=1) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}else if(arr[n-1]-arr[n-2]<=1) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
