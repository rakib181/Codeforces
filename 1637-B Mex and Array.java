/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class MexAndArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0) {
    	  int n=sc.nextInt(),ans=0;
    	  int[] arr=new int[n];
    	  for(int i=0;i<n;i++) {
    		  arr[i]=sc.nextInt();
    	  }
    	  for(int i=0,k=1;i<n;i++) {
    		  ans+=k*(n-i);
    		  if(arr[i]==0) {
    			  ans+=k*(n-i);
    		  }
    		  k++;
    	  }
    	  System.out.println(ans);
      }
	}
}
