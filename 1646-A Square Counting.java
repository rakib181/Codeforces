import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			long n=sc.nextLong(),s=sc.nextLong(),k=n*n;
					System.out.println(s/k);
		}
	}
}
