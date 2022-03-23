import java.util.*;
public class PolycarpsPockets {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		Map<Integer,Integer>mp=new HashMap<>();
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(!mp.containsKey(arr[i])) {
				mp.put(arr[i], 1);
			}else {
				mp.put(arr[i], mp.get(arr[i])+1);
			}
		}
		int max=Collections.max(mp.values());
		System.out.println(max);
	}
}
