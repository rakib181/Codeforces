import java.util.*;

public class GameOfBallPassing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();long sum=0,max=0;
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
				sum+=arr[i];
			}
			Arrays.sort(arr);
			max=arr[n-1];
			if(max==0) {
				System.out.println("0");
			}else if((2*max)<=sum) {
				System.out.println("1");
			}else {
				System.out.println((2*max)-sum);
			}	
		}
	}
}
