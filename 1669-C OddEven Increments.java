import java.util.*;

public class OddEvenIncrements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int[] arr=new int[n];boolean ok=true;
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
				if((arr[i]&1)!=(arr[(i&1)]&1)) {
					ok=false;
				}
			}
			System.out.println(ok?"YES":"NO");
         }
	}
}
