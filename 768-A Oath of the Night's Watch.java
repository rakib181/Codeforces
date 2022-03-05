import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),min=0,max=0,cnt=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		max=arr[n-1];
		min=arr[0];
		for(int i=1;i<n-1;i++){
			if(arr[i]<max && arr[i]>min){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
