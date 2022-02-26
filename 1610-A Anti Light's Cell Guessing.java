import java.util.*;
public class Main {
	static void solve(int n,int m){
		if(n==1 && m==1){
			System.out.println("0");
		}else if(n==1 || m==1){
			System.out.println("1");
		}else{
			System.out.println("2");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt(),m=sc.nextInt();
			solve(n,m);
		}
	}
}
