import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			long c=0;
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			for(int i=0;i<n;i++){
				if(i<n-1){
					c+=arr[i];
				}
			}
			System.out.println((long)arr[n-1]+((double)c/(long)(n-1)));
		}
	}
}
