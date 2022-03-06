import java.util.*;

public class CommonSubsequence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int a=sc.nextInt(),b=sc.nextInt(),flag=0;
			int[] arr=new int[a];
			int[] arr1=new int[b];
			Map<Integer,Integer>mp=new HashMap<>();
			for(int i=0;i<a;i++) {
				arr[i]=sc.nextInt();
				mp.put(i, arr[i]);
			}
			for(int i=0;i<b;i++) {
				arr1[i]=sc.nextInt();
				if(mp.containsValue(arr1[i])) {
					flag=arr1[i];	
				}
			}
			if(flag!=0) {
				System.out.println("YES"+"\n"+"1"+" "+flag);
			}else {
			System.out.println("NO");
			}
		}
	}
}
