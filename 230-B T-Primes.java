/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class TPrimes {
	static int Max_Size=1000000;
	public static boolean[] sieve() {
		boolean[] isPrime=new boolean[Max_Size+1];
		Arrays.fill(isPrime, true);
		isPrime[0]=false;isPrime[1]=false;
		for(int i=2;i*i<=Max_Size;i++) {
			for(int j=2*i;j<=Max_Size;j+=i) {
				isPrime[j]=false;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        boolean isPrime[]=sieve();
        Set<Long>set=new TreeSet<>();
        for(int i=2;i<=Max_Size;i++) {
        	if(isPrime[i]==true) {
        		set.add((long)i);
        	}
        }
        int n=sc.nextInt();
        while(n-->0) {
        	long x=sc.nextLong(),k=0,flag=0;
        	if(x==1) {
        		System.out.println("NO");
        		flag=1;
        	}else {
        	k=(long)Math.sqrt((double)x);
        	if(k*k==x) {
        		if(set.contains(k)) {
        			System.out.println("YES");
        			flag=1;
        		}
        	}
        }
        	if(flag==0) {
        		System.out.println("NO");
        	}
        }
       
	}

}
