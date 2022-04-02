import java.util.*;
public class TwoArrays {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     while(t-->0) {
    	 int n=sc.nextInt();
    	 int[] a=new int[n];
    	 int[] b=new int[n];
    	 for(int i=0;i<n;i++) {
    		 a[i]=sc.nextInt();
    	 }
    	 for(int i=0;i<n;i++) {
    		 b[i]=sc.nextInt();
    	 }
    	 Arrays.sort(a);
    	 Arrays.sort(b);
    	 boolean ans=true;
    	 for(int i=0;i<n;i++) {
    		if(a[i]!=b[i] && a[i]!=b[i]-1) {
    			ans=false;
    		}
    	 }
    	 System.out.println(ans?"YES":"NO");
     }
	}
}
