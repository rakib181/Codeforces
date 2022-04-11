import java.util.*;
public class DivideNMultiply {
	static Scanner sc=new Scanner(System.in);
	static long russPeasant(long x,long y) {
		long res=0;
		while(y>0) {
			if((y&1)==1) {
				res+=x;
			}
			x<<=1;
			y>>=1;
		}
		return res;
	}
	static void solve() {
		int n=sc.nextInt();long tmp=1,sum=0;
		long[] arr=new long[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextLong();
			while((arr[i]&1)==0) {
				arr[i]>>=1;
		        tmp<<=1;
			}
		}
		Arrays.sort(arr);
		arr[n-1]=russPeasant(arr[n-1],tmp);
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int t=sc.nextInt();
		while(t-->0) {
			solve();
		}
	}
}
