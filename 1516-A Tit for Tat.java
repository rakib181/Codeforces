import java.util.*;
public class TitForTat{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		int n=sc.nextInt(),k=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++){
		if(k>arr[i]){
			k-=arr[i];
			arr[n-1]+=arr[i];
			arr[i]=0;
		}else{
			arr[i]-=k;
			arr[n-1]+=k;
			k=0;
		}
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		}	
	}
}
