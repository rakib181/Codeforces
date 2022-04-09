import java.util.*;

public class ArrayBalancing {
	static void swap(int i,int j,int[]a ,int[]b) {
		int tmp=a[i];
		a[i]=b[j];
		b[j]=tmp;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int[] a=new int[n];
			int[] b=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++) {
				b[i]=sc.nextInt();
			}
			
			for(int i=0;i<n;i++) {
				if(a[i]>=b[i]) {
					swap(i,i,a,b);
				}
			}
			long ans=0;
			for(int i=0;i<n-1;i++) {
				ans+=Math.abs(a[i]-a[i+1])+Math.abs(b[i]-b[i+1]);
			}
			System.out.println(ans);
		}
	}
}
