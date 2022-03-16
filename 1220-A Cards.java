/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class Cards{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(),cntn=0,cntz=0;
	StringBuilder sb=new StringBuilder(sc.next());
	for(int i=0;i<n;i++){
		if(sb.charAt(i)=='n'){
			cntn++;
		}else if(sb.charAt(i)=='z'){
			cntz++;
		}
		}	
		for(int i=0;i<cntn;i++){
			System.out.print("1"+" ");
		}
		for(int i=0;i<cntz;i++){
			System.out.println("0"+" ");
		}
	}
}
