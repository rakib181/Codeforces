import java.util.*;
public class InterviewWithOleg {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	String s=sc.next();
	System.out.println(s.replaceAll("o(go)+","***"));
	}
}
