import java.util.*;
public class IchihimeAndTriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
			System.out.println(Math.max(a, b)+" "+(Math.max(b, c))+" "+(Math.min(c, d)));
		}
	}
}
