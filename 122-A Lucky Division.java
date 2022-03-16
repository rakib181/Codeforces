/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class LuckyDivision {
	public static boolean isLucky(int k){
		String s=Integer.toString(k);int flag=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='4' || s.charAt(i)=='7'){
				flag++;
			}
		}
		if(flag==s.length()){
			return true;
		}else{
			return false;
		}
		
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=4;i<=n;i++){
		if(isLucky(i)){
			if((n%i)==0){
				System.out.println("YES");
				return;
			}
		}
		}	
		System.out.println("NO");
	}
}
