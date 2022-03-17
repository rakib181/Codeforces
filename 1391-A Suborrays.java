/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class SubOrrays {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		int n=sc.nextInt();
		int[] arr=new int[n+1];
		for(int i=1;i<=n;i++){
			arr[i]=i;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		}	
	}
}
