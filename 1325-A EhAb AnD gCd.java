import java.util.*;

public class EhabAndGCd {
	/*
	 * static int GCD(int a,int b) { if(b==0) { return a; } return GCD(b,a%b); }
	 * static int LCM(int a,int b) { return (a/GCD(a,b))*b; }
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
		int x=sc.nextInt();
		//System.out.println(GCD(1,x-1)+LCM(1,x-1));
		System.out.println("1"+" "+(x-1));
		}
	}

}
