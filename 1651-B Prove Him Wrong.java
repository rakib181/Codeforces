/*----->Hope Can Set You Free<-----*/
import java.util.*;

public class ProveHimWrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int[] arr=new int[n];
			if(n>19) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
				arr[0]=1;
				System.out.print(arr[0]+" ");
				for(int i=1;i<n;i++) {
					arr[i]=arr[i-1]*3;
					System.out.print(arr[i]+" ");
				}
				System.out.println();
			}
		}
	}
}
