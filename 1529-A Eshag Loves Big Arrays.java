import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt(),c=0,min=1000000007;
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
				min=Math.min(min,arr[i]);
			}
			for(int i=0;i<n;i++){
				if(min!=arr[i]){
					c++;
				}
			}
			System.out.println(c);
		}
	}
}
