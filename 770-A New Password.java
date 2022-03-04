import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt();
		StringBuilder sb=new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		StringBuilder sb1=new StringBuilder();
		for(int i=0;i<n;i++){
			sb1.append(sb.charAt(i%k));
		}
		System.out.println(sb1);
	}
}
