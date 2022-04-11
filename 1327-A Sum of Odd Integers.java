import java.util.*;
public class SumOfOddInteger {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt(),k=sc.nextInt(),sq=(int)Math.sqrt(n);
			if(sq>=k & (n&1)==(k&1)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
