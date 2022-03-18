/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class AvgHeigth {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			List<Integer>yo=new ArrayList<>();
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
				if((arr[i]&1)==1){
					yo.add(arr[i]);
				}
			}
			for(int i=0;i<n;i++){
				if((arr[i]&1)==0){
					yo.add(arr[i]);
				}
			}
	     for(int x:yo){
	     	System.out.print(x+" ");
	     }
	     System.out.println();
		}
	}
}
