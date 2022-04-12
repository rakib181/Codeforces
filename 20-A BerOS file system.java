import java.util.*;
public class BerOSfileSystem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String s=sc.next(),str;
        str=s.replaceAll("/(/)+", "/");int n=str.length();
        if(n!=1) {
        	char[] ch=str.toCharArray();
        	if(ch[n-1]=='/') {
        		for(int i=0;i<n-1;i++) {
        			System.out.print(ch[i]);
        		}
        	}else {
        		System.out.println(str);
        	}
        }else {
        	System.out.println(str);
        }
	}
}
