import java.util.Scanner;

public class TwoRabbits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int x=sc.nextInt(),y=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();
			 if((x-y)%(a+b)==0) {
					System.out.println(Math.abs((x-y)/(a+b)));	
			}else {
				System.out.println("-1");
			}
		}
	}
}
