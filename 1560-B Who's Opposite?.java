import java.util.*;

public class WhosOpposite {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
			int n=2*Math.abs(a-b);
			if(n<c || n<b || n<a) {
				System.out.println("-1");
			}else {
				int x=(n/2)+c;
				while(x>n) {
					x-=n;
				}
					System.out.println(x);
			}
		}
	}
}
