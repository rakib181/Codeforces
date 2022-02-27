import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt(),ans=1;
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			if(n==1){
				System.out.println(arr[0]);
			}else{
			ans=arr[0]&arr[1];
			for(int i=1;i<n;i++){
				ans&=arr[i];
			}
			System.out.println(ans);
		}
		}
	}
}
