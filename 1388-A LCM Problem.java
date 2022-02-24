import java.util.*;

public class LCMProblem{
	
	  static long GCD(long a,long b) { if(b==0) { return a; } return GCD(b,a%b); }
	  static long LCM(long a,long b) { return (a/GCD(a,b))*b; }
	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long t=sc.nextInt();
		while(t-->0) {
		long a=sc.nextLong(),b=sc.nextLong();
		if(2*a>b){
			System.out.println("-1"+" "+"-1");
		}else{
		System.out.println(a+" "+2*a);
	}
		}
	}

}
