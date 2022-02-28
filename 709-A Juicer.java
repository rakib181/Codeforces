import java.util.*;

public class Juicer {
	static void solve(int x) {
			System.out.println(x);
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(),b=sc.nextInt(),d=sc.nextInt(),sum=0,x=0;
	int[] arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();	
		if(arr[i]<=b) {
			sum+=arr[i];
		}
		if(sum>d) {
			x++;
			sum=0;
		}
	}
	solve(x);
	}

}
