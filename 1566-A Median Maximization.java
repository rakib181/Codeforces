import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
			long a=sc.nextLong(),b=sc.nextLong();
			long x=(a/2)+1;
			long y=b/x;
			System.out.println(y);
		}
	}
}
