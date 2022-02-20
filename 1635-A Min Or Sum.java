import java.util.Scanner;

public class MinOrSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt(),sum=0;
			int[] arr=new int[n+1];
			int[] arr1=new int[n+1];
			for(int i=1;i<=n;i++) {
				arr[i]=sc.nextInt();
			}
			for(int i=1;i<=n-1;i++) {
				arr1[i]=0;
				arr1[i+1]=(arr[i] | arr[i+1]);
				arr[i+1]=arr1[i+1];
			}
			for(int i=1;i<=n;i++) {
				sum+=arr1[i];
			}
			System.out.println(sum);
			
		}

	}

}
