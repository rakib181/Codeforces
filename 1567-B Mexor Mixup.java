import java.util.*;
public class MexOrMixup {
	static void solve(int a,int b) {
		int x=0;
		if(a%4==0) {
			x=0;
		}else if(a%4==1) {
			x=a-1;
		}else if(a%4==2) {
			x=1;
		}else if(a%4==3){
			x=a;
		}
		
		if(x==b) {
			System.out.println(a);
		}else if((x^b)!=a) {
			System.out.println(a+1);
		}else {
			System.out.println(a+2);	
		}
		
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int a=sc.nextInt(),b=sc.nextInt();
			solve(a,b);
		}
	}
}
