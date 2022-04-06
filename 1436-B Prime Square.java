import java.util.*;
public class PrimeSquare{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[][] prime=new int[n][n];
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if(i==j || j==n-i-1){
						prime[i][j]=1;
					}else{
						prime[i][j]=0;
					}
					if((n&1)==1){
							if(i==n/2){
							prime[i][0]=1;
							}
							if(i==0&&j==n/2){
								prime[i][j]=1;
							}
					}
				}
			}
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					System.out.print(prime[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}
