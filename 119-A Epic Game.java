/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class EpicGame {
	public static int GCD(int x,int n){
		if(n==0){
			return x;
		}
		return GCD(n,x%n);
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt(),b=sc.nextInt(),n=sc.nextInt();
	while(true){
		n-=GCD(a,n);
		if(n==0){
			System.out.println("0");
			break;
		}
		n-=GCD(b,n);
		if(n==0){
			System.out.println("1");
			break;
		}
	}
	}
}
