import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();long max=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++){
			max=Math.max(max,(long)arr[i]*(long)arr[i-1]);
		}
		System.out.println(max);
		}
	}
}
