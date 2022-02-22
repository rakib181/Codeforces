import java.util.*;

public class FiveCopy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			Set<Integer>set=new TreeSet<>();
			for(int i=0;i<n;i++) {
				set.add(arr[i]);
			}
			System.out.println(set.size());
		}

	}

}
