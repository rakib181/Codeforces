/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class ThreeIndices {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t-->0) {
    	   int n=sc.nextInt(),flag=0,u=0,j=0,k=0;
    	   int[] arr=new int[n+1];
    	   for(int i=1;i<=n;i++) {
    		   arr[i]=sc.nextInt();
    	   }
    	   for(int i=2;i<n;i++) {
    		   if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
    			   u=i-1;j=i;k=i+1;
    			   flag=1;
    		   }
    	   }
    	   if(flag==1) {
    		   System.out.println("YES"+"\n"+u+" "+j+" "+k);
    	   }else {
    		   System.out.println("NO");
    	   }
       }
	}

}
