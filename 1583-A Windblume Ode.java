import java.util.Scanner;

public class WindblumeOde {
	static boolean isPrime(int x) {
		for(int i=2;i<=x/2;i++) {
			if(x%i==0) {
				return false;
			}
		}
		return true;	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt(),sum=0,k=0;
			int[] arr=new int[n+1];
			for(int i=1;i<=n;i++) {
				arr[i]=sc.nextInt();
				sum+=arr[i];
			}
			if(isPrime(sum)) {
				System.out.println(n-1);
				for(int i=1;i<=arr.length;i++) {
					if(arr[i]%2!=0) {
						k=i;
						break;
					}
					}
				for(int i=1;i<=n;i++) {
					if(i!=k) {
						System.out.print(i+" ");
					}
				}
			}else {
				System.out.println(n);
				for(int i=1;i<=n;i++) {
					System.out.print(i+" ");
				}
			}
			
			System.out.println();
		}

	}

}
