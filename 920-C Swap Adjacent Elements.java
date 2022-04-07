import java.util.*;

public class SwapAdjecentElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),MX=-1;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		String s=sc.next();
		for(int i=0;i<n-1;i++) {
			 MX=Math.max(arr[i], MX);
			 if(s.charAt(i)=='0'&& MX>i+1) {
				 System.out.println("NO");
				 return;
			 }
		}
		System.out.println("YES");
	}
}
