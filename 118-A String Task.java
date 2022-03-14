/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class StringTask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next().toLowerCase();
		StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o'|| s.charAt(i)=='u' || s.charAt(i)=='y') {
        		continue;
        	}else {
        		sb.append('.');
        		sb.append(s.charAt(i));
        	}
        }
        System.out.println(sb);
	}

}
