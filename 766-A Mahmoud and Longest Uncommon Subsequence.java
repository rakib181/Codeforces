import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder(sc.next());
		StringBuilder sb1=new StringBuilder(sc.next());
		if(sb.toString().equals(sb1.toString())){
			System.out.println("-1");
		}else{
			System.out.println(Math.max(sb.length(),sb1.length()));
		}
	}
}
