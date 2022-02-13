import java.util.Scanner;

public class MostUntableArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
		int n=sc.nextInt(),m=sc.nextInt();
		if(n==1) {
			System.out.println("0");
		}else if (n==2){
			System.out.println(m);
		}else {
			System.out.println(m*2);
		   }
		}
	}
}
