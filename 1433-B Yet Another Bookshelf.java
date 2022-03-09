import java.util.*;

public class YetAnotherBookshelf {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0) {
		int n=sc.nextInt(),idxs=0,idxe=0,cnt=0,flag=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(flag==0 && arr[i]==1) {
				flag=1;idxs=i;
			}
		}
		for(int i=n-1;i>=0;i--) {
			if(arr[i]==1) {
				idxe=i;break;
			}
		}
		for(int i=idxs;i<=idxe;i++) {
			if(arr[i]==0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	    }
	}
}
