import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		int n=sc.nextInt(),k=sc.nextInt();
		String s=sc.next();
		StringBuilder sb=new StringBuilder(s);
		String p=sb.reverse().toString();
		if(s.equals(p) || k==0){
			System.out.println("1");
		}else{
			System.out.println("2");
		}
		}
	}
}
