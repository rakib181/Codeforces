import java.util.*;

public class BalancedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
		int n=sc.nextInt(),sum=0,sum1=0;
		List<Integer>list=new ArrayList<>();
		for(int j=1;j<=n/2;j++) {
			sum+=j*2;
			list.add(j*2);
		   }
		for(int j=1;j<n/2;j++) {
			sum1+=j*2-1;
			list.add(j*2-1);
		}
		if((sum-sum1)%2==0) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
			list.add(sum-sum1);
			for(int C:list) {
				System.out.print(C+" ");
			}
			System.out.println();
		  }
		}	
	}
}
