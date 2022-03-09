import java.util.*;
public class QAQ {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder(sc.next());
		int cnt=0,q=0,a=0;
		for(int i=0;i<sb.length();i++){
			if(sb.charAt(i)=='Q'){
				cnt+=q;a++;
			}else if(sb.charAt(i)=='A'){
				q+=a;
			}
		}
		System.out.println(cnt);
	}
}
