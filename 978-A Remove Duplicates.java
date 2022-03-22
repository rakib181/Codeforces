import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Set<Integer>set=new LinkedHashSet<>();
		for(int i =n-1;i>=0;i--) {
			set.add(arr[i]);
		}
		List<Integer>yo=new ArrayList<>(set);
		Collections.reverse(yo);
		System.out.println(yo.size());
		for(int x:yo) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
}
