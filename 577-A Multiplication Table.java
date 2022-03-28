import java.util.*;
public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong(),x=sc.nextLong(),cnt=0;
		/*
		 * int[][] arr=new int[n][n]; for(int i=0;i<n;i++) { for(int j=0;j<n;j++) {
		 * if(i==0) { arr[i][j]=j+1; }else if(j==0) { arr[i][j]=i+1; } else {
		 * arr[i][j]=(j+1)*arr[i][0]; } if(arr[i][j]==x) { cnt++; } } }
		 * System.out.println(cnt);
		 */
		for(int i=0;i<n;i++) {
			if(x%(i+1)==0 && (i+1)*n>=x) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
