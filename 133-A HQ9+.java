/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class HQ9Plus{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	List<Character>yo=new ArrayList<>();
	yo.add('H');
	yo.add('Q');	
	yo.add('9');
	String s=sc.next();
	char[] ch=s.toCharArray();
	for(int i=0;i<s.length();i++){
		if(yo.contains(ch[i])){
			System.out.println("YES");
			return;
		}
	}
	System.out.println("NO");
	}
}
