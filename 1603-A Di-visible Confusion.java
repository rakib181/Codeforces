import java.util.*;

public class DivisibleConfusion {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0) {
		int n=sc.nextInt();boolean yes=true,yo;
		int[] arr=new int[n+1];
		for(int i=1;i<=n;i++) {
			arr[i]=sc.nextInt();yo=false;
			for(int j=i+1;j>=2;j--) {
				if(arr[i]%j!=0) {
					yo=true;
					break;
				}
			}
			yes&=yo;
		}
	System.out.println(yes?"YES":"NO");
	}
	}
}
