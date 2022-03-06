import java.util.*;

public class Keyboard {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		StringBuilder s=new StringBuilder("qwertyuiopasdfghjkl;zxcvbnm,./");
		StringBuilder sb1=new StringBuilder();
		StringBuilder sb=new StringBuilder(sc.next());
		if(c=='R') {
			for(int i=0;i<sb.length();i++) {
				for(int j=0;j<s.length();j++) {
					if(sb.charAt(i)==s.charAt(j)) {
						sb1.append(s.charAt(j-1));
					}
				}
				
			}
			System.out.println(sb1);
			}else {
				for(int i=0;i<sb.length();i++) {
					for(int j=0;j<s.length();j++) {
						if(sb.charAt(i)==s.charAt(j)) {
							sb1.append(s.charAt(j+1));
						}
					}
					
				}
				System.out.println(sb1);
			}

	}

}
