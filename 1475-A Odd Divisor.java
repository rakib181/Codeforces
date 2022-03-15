/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class OddDivisor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			long n=sc.nextLong();
			if((n&(n-1))>0){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}
