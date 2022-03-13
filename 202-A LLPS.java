/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class LLPS {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	StringBuilder sb=new StringBuilder(sc.next());
	char[] ch=sb.toString().toCharArray();
	Arrays.sort(ch);
	for(int i=sb.length()-1;i>=0;i--){
		if(ch[i]==ch[sb.length()-1]){
			System.out.print(ch[i]);
		}else{
			break;
		}
		}	
	}
}
