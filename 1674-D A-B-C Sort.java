import java.util.*;

public class ABCSort {
	static void swap(int i, int j, int[] arr) {
		arr[i] ^= arr[j];
		arr[j] ^= arr[i];
		arr[i] ^= arr[j];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();boolean ok=true;
			int[] arr = new int[n + 1];
			for (int i = 1; i <= n; i++) {
				arr[i] = sc.nextInt();
			}
			for(int i=n;i>1;i-=2) {
				if(arr[i]<arr[i-1]) {
					swap(i,i-1,arr);
				}
			}
			for(int i=1;i<n;i++) {
				if(arr[i]>arr[i+1]) {
					ok=false;
					break;
				}
			}
			System.out.println(ok?"YES":"NO");
		}
	}
}
