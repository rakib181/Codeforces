import java.util.*;
public class MarinAndAnticoprimePermutation {
static int mod=998244353;
    static long fact(long n) {
    	long fact=1;
    	for(int i=2;i<=n;i++) {
    		fact=(fact*i)%mod;
    	}
    	return fact;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			long n=sc.nextLong();
			 if((n&1)==0) {	
			System.out.println((fact(n/2)*fact(n/2))%mod);
			}else {
				System.out.println("0");
			}
		}
	}
}
