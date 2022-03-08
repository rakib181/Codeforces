import java.util.*;

public class DeletionsOfTwoAdjacentLetters {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		while(n-->0) {
		StringBuilder sb=new StringBuilder(sc.next());
		char ch=sc.next().charAt(0);int flag=0;
		for(int i=0;i<sb.length();i++) {
			if(sb.charAt(i)==ch && ((i+1)&1)!=0) {
				flag=1;break;
			}
		}
		if(flag==1) {
			System.out.println("YES");
			continue;
		}else {
		System.out.println("NO");
		  }
		}
	}

}
