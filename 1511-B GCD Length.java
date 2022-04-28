import java.util.*;
public class GCDLength {
	static long binPow(int x,int y) {
		if(y==0) {
			return 1;
		}
		long res=binPow(x,y/2);
		if((y&1)==1) {
			return x*res*res;
		}else {
			return res*res;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
			System.out.println((binPow(10,a-1)+(binPow(10,c-1)))+" "+binPow(10,b-1));
		}
	}
}
