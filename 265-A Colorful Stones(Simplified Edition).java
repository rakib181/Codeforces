import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder s=new StringBuilder(sc.next());
		StringBuilder t=new StringBuilder(sc.next());
		int k=0;
		for(int i=0;i<t.length();i++){
			if(t.charAt(i)==s.charAt(k)){
				k++;
			}
		}
		System.out.println(k+1);
	}
}
