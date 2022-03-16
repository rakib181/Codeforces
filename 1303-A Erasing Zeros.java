/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class ErasingZeros{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			StringBuilder sb=new StringBuilder(sc.next());
			if(sb.length()<3){
				System.out.println("0");
			}else{
			int leftOne=0,rightOne=0,cnt=0;
			for(int i=0;i<sb.length();i++){
				if(sb.charAt(i)=='1'){
					leftOne=i;break;
				}
			}
			for(int i=sb.length()-1;i>=0;i--){
				if(sb.charAt(i)=='1'){
					rightOne=i;break;
				}
			}if(leftOne>0 || rightOne>0){
			for(int i=leftOne;i<=rightOne;i++){
				if(sb.charAt(i)=='0'){
					cnt++;
				}
			}
			System.out.println(cnt);
		}else{
			System.out.println(cnt);
		}
			}
		}
	}
}
