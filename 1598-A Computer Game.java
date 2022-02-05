import java.util.*;
public class ComputerGame {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int n=sc.nextInt(),flag=0;
			String s1=sc.next(),s2=sc.next();
			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();
			for(int j=0;j<s1.length();j++) {
				if(ch1[j]=='1'&& ch2[j]=='1') {
					flag=1;
					break;
				}
			}
			if(flag==1) {
			System.out.println("NO");
			}else {
				System.out.println("YES");
			}
		}
	}
}
