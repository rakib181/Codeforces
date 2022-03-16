/*----->Hope Can Set you Free<----*/
import java.util.*;
public class PimesKha {
	public static boolean isPrime(int n) {
		
		  if(n<2) { return false; }
		 
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(),k=n-2;
      if(isPrime(k)) {
    	  System.out.println("2"+" "+(n-2));
      }else {
    	  System.out.println("-1");
      }
	}
}
