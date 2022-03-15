/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class BadUglyNumbers{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			StringBuilder sb=new StringBuilder("2");
			int n=sc.nextInt();
			if(n==1){
				System.out.println("-1");
			}else{
				for(int i=1;i<n;i++){
					sb.append(3);
				}
				System.out.println(sb);
			}
		}
	}
}
