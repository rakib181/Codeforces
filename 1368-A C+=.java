import java.util.*;

public class CPlusEqual {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int a=sc.nextInt(),b=sc.nextInt(),n=sc.nextInt(),c=0;
			if(b>a) {
				while(b<=n) {
					int tmp=b;
					b+=a;
					a=tmp;
					c++;
				}
				System.out.println(c);
			}else {
				while(a<=n) {
					int tmp=a;
					a+=b;
					b=tmp;
					c++;
				}
				System.out.println(c);
			}
		}
	}
}
