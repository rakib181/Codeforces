import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder("abcd");
		int n=sc.nextInt();String s="";
		for(int i=0;i<n;i++){
			s+=sb.charAt(i%4);
		}
		System.out.println(s);
	}
}
