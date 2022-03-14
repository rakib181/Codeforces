/*----->Hope Can Set You Free<-----*/
import java.util.*;

public class AlmostPrime {	
static List<Integer>pri=new ArrayList<>();
public static void imSeive(int n) {
	boolean[] yoPrime=new boolean[n+1];
 Arrays.fill(yoPrime, true);
 for(int i=2;i*i<=n;i++) {
	 if(yoPrime[i]==true) {
		 for(int j=2*i;j<=n;j+=i) {
			yoPrime[j]=false;
		 }
	 }
 }
 for(int i=2;i<=n;i++) {
	 if(yoPrime[i]==true) {
		 pri.add(i);
	 }
 }
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),cnt=0,pfact=0;
          imSeive(n);
         for(int i=1;i<=n;i++) {
        	 for(int j=0;j<pri.size()-1;j++) {
        		 if(i%(pri.get(j))==0) {
        			 ++pfact;
        			
        		 } 
        	 }
        	 if(pfact==2) {
    			 cnt++;
    		 }
        	pfact=0;
         }
         System.out.println(cnt);
	}
}
