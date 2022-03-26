import java.util.*;
public class UniformString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			StringBuilder sb=new StringBuilder("abcdefghijklmnopqrstuvwxyz");
			StringBuilder sb1=new StringBuilder();
			int n=sc.nextInt(),k=sc.nextInt();
			for(int i=0;i<n;i++) {
				sb1.append(sb.charAt(i%k));
			}
			System.out.println(sb1);
		}
	}
}
