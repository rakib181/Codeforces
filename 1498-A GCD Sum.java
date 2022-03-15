import java.util.*;

public class GCDSum {
	public static long sumDig(long n) {
		String k=Long.toString(n);int sum=0;
		for(int i=0;i<k.length();i++) {
			sum+=Character.getNumericValue(k.charAt(i));
		}
		return sum;
	}
	public static long GCD(long n,long x) {
		if(x==0) {
			return n;
		}
		return GCD(x,n%x);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			long n=sc.nextLong();	
		if(GCD(n,sumDig(n))>1) {
			System.out.println(n);
		}
		else if(GCD((n+1),sumDig(n+1))>1) {
			System.out.println(n+1);
		}
		else if(GCD((n+2),sumDig(n+2))>1) {
				System.out.println(n+2);		
		}
	}
  }
}
