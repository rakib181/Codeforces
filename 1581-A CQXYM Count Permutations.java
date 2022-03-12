/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class CQXYMCountPermutations {
    static int mod=1000000007;
    public static void Factorial(int n) {
    	long fact=1;
    	for(int i=1;i<=n;i++) {
    		fact=(fact%mod)*i;
    	}
    	System.out.println((fact/2)%mod);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         while(t-->0) {
        	 int n=sc.nextInt();int  k=2*n;
        	 Factorial(k);
         }
	}

}
