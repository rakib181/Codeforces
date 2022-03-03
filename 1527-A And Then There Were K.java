import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt(),c=0;
			while(n!=0){
				c++;
				n>>=1;
			}
			System.out.println((1<<(c-1))-1);
		}
	}
}
