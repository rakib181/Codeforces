import java.lang.*;
import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		System.out.print(s);
		System.out.println(sb);
		
	}
}
