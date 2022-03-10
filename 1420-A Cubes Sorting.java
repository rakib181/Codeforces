/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class CubesSorting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			boolean yo=true;
			for(int i=0;i<n-1;i++){
				if(arr[i]<=arr[i+1]){
					yo=false;
					break;
				}
			}
			System.out.println((yo)? "NO" :"YES");
		}
	}
}
