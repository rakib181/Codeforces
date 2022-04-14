import java.util.*;
public class MulTable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();long ans=0;
		long[][] arr=new long[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextLong();
			}
		}
        ans=(long) Math.sqrt((arr[0][1]*arr[0][2])/arr[1][2]);
        System.out.print(ans+" ");
        for(int i=1;i<n;i++) {
        	System.out.print(arr[0][i]/ans+" ");
        }
	}
}
