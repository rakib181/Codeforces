import java.util.*;

public class NearestInterestingNumber {
	static int isPossible(int n) {
		if(n==0) {
			return 0;
		}
		return n%10+isPossible(n/10);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(isPossible(n)%4!=0) {
			n++;
		}
		System.out.println(n);
	}
}
