import java.util.*;
public class MakeEqualWithMod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			boolean Z=false,C=false;
			for(int i=0;i<n;i++) {
				if(arr[i]==1) {
					Z=true;
				}
				if(i<n-1) {
					if(arr[i]+1==arr[i+1]) {
						C=true;
					}
				}
			}
			if(Z & C) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
		}
	}
}
