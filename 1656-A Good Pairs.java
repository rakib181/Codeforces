import java.util.*;
public class GoodPairs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt(),min=1000000007,max=-1000000007,idx1=0,idx2=0;
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
				if(arr[i]<min) {
					min=arr[i];
					idx1=i+1;
				}
				if(arr[i]>max) {
					max=arr[i];
					idx2=i+1;
				}
			}
			System.out.println(idx1+" "+idx2);
		}
	}
}
