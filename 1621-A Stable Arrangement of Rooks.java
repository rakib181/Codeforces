import java.util.*;

public class StableArrangementOfRooks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt(),k=sc.nextInt(),cnt=0;
			if(((n+1)/2)<k) {
				System.out.println("-1");
			}else {
				String sb="";
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
				    sb+='.';
				}
					char[] ch=sb.toCharArray();
					if(((i+1)&1)==1 && cnt<k) {
						ch[i]='R';cnt++;
					}	
					System.out.println(ch);
					sb="";
				}	
			}
		}
	}
}
