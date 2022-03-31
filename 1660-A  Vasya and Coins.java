import java.util.*;
public class VasyaAndCoins {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			long a=sc.nextLong(),b=sc.nextLong();
			 if(a==0 && b==0) {
				System.out.println("1");
			}
			 else if(a==0) {
					System.out.println("1");
				}
			else {
				System.out.println((a+2*b)+1);
			}
		}
	}
}
