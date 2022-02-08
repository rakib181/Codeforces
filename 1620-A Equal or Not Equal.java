import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
			int c=0;
			String s=sc.next();
			char[] ch=s.toCharArray();
			for(int j=0;j<s.length();j++){
				if(ch[j]=='N'){
					c++;
				}
			}
			if(c==1){
				System.out.println("NO");
			}else{
				System.out.println("YES");
			}
		}
	}
}
