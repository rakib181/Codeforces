import java.util.*;
public class AbsentRemainder{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		int n=sc.nextInt(),min=1000000007;
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			if(arr[i]<min){
				min=arr[i];
			}
		}
		for(int i=0,cnt=0;cnt<n/2;i++){
			if(arr[i]!=min){
				System.out.println(arr[i]+" "+min);
				cnt++;
			}
		 }
		}	
	}
}
