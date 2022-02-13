import java.util.Arrays;
import java.util.*;

public class GiftFixing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int n=sc.nextInt();long c=0;
			int[] a=new int[n];
			int[] b=new int[n];
			int[] d1=new int[n];
			int[] d2=new int[n];
			for(int j=0;j<n;j++) {
				a[j]=sc.nextInt();
				d1[j]=a[j];
			}
			for(int j=0;j<n;j++) {
				b[j]=sc.nextInt();
				d2[j]=b[j];
			}
			Arrays.sort(d1);
			Arrays.sort(d2);
			for(int k=0;k<n;k++) {
				c+=Math.max((a[k]-d1[0]),(b[k]-d2[0]));
			}
			System.out.println(c);
	    }	
	}

}
