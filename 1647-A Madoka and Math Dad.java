import java.util.*;
public class MadokaAndDad {
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0) {
		int n=sc.nextInt();
		StringBuilder sb=new StringBuilder();
		if((n%3)==1) {
			int last=1;
			sb.append("1");
			n-=1;
			while(n>0) {
				if(last==1) {
					sb.append("2");n-=2;
					last=0;
				}else {
					sb.append("1");n-=1;
					last=1;
				}
			}
		}else {
			while(n>0) {
				sb.append("2");n-=2;
				if(n==0) {
					break;
				}else {
					sb.append("1");
					n-=1;
				}
			}
		}
		System.out.println(sb);
	  }
	}
}
