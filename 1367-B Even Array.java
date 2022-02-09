import java.util.*;

public class EvenArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int n=sc.nextInt(),c=0,d=0;
			int[] arr=new int[n];
			for(int j=0;j<n;j++) {
				arr[j]=sc.nextInt();
			}
			for(int k=0;k<n;k++) {
				if(k%2==0 && arr[k]%2!=0) {
					c++;
				}
				if(k%2!=0 && arr[k]%2==0) {
					d++;
				}				
			}
			if(d!=c) {
				System.out.println("-1");
			}else {
				System.out.println(c);
			}
		}	
	}
}
