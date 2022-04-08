import java.util.*;

public class ArrayCloningTechnique {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt(),k=0;
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
				int cnt=n-max;
				while(max<n) {
					k++;
					max<<=1;
				}
				System.out.println(cnt+k);
			}
	}
}
