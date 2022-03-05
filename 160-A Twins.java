import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),sum=0,split=0,cnt=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		int k=n-1;
		Arrays.sort(arr);
		while(sum>=split){
			sum-=arr[k];
			split+=arr[k];
			cnt++;
			k--;
		}
		System.out.println(cnt);
	}
}
