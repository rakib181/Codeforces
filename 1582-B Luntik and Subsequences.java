import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt(),zero=0,one=0;
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
				if(arr[i]==0){
					zero++;
				}
				if(arr[i]==1){
					one++;
				}
			}
			System.out.println(((long)one*((long)1<<zero)));
		}
	}
}
