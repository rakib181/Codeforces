import java.util.*;

public class ImBoredWithLife {
	/*
	 * public static long FactorialA(long a) { if(a==0 || a==1) { return 1; } return
	 * a*FactorialA(a-1); } public static long FactorialB(long b) { if(b==0 || b==1)
	 * { return 1; } return b*FactorialA(b-1);
	 * 
	 * } public static long GCD(long x,long y) { if(y==0) { return x; } return
	 * GCD(y,x%y); }
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong(),b=sc.nextLong(),yo=1;
		//long x=FactorialA(a),y=FactorialB(b);
          //long ans=GCD(x,y);
		for(int i=1;i<=Math.min(a,b);i++) {
			yo*=i;
		}
        System.out.println(yo); 
	}
}
