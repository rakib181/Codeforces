import java.util.*;
public class PrimeMatrix {
	static int MX=1000005;
    static boolean[] sieveEra=new boolean[MX+1];
    static int[][] arr=new int[505][505];
    static int[] a=new int[505];static int[] b=new int[505];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,m,i,j,cnt;
		Arrays.fill(sieveEra, true);
		sieveEra[0]=false;sieveEra[1]=false;
		for(i=2;i<=MX;i++) {
			if(sieveEra[i]==true) {
				for( j=i+i;j<=MX;j+=i) {
					sieveEra[j]=false;
				}
			}
		}
		n=sc.nextInt();m=sc.nextInt();
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
				cnt=0;
				while(sieveEra[arr[i][j]]==false) {
					arr[i][j]++;cnt++;
				}
				a[i]+=cnt;
				b[j]+= cnt;
			}
		}
		int min1=1000000007,min2=1000000007;
		for(i=0;i<n;i++) {
			if(a[i]<min1) {
				min1=a[i];
			}
		}
		for(j=0;j<m;j++) {
			if(b[j]<min2) {
				min2=b[j];
			}
		}
	System.out.println(Math.min(min1, min2));
}
	
}
