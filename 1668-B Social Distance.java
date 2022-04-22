import java.util.*;
public class SD {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		int n=sc.nextInt(),m=sc.nextInt();
		int[] arr=new int[n];long sum=0;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		Arrays.sort(arr);
		System.out.println(n+sum-arr[0]+arr[n-1]<=m?"YES":"NO");
		}	
	}
}
