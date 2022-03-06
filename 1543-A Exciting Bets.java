import java.util.*;
public class ExcitingBets {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			long a=sc.nextLong(),b=sc.nextLong();
			if(a==b){
				System.out.println("0"+" "+"0");
			}else{
				long n=Math.abs(a-b),m=Math.min((a%n),(n-(a%n)));
				System.out.println(n+" "+m);
			}
		}
	}
}
