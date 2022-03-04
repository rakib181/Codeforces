import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder(sc.next());
		StringBuilder sb1=new StringBuilder();
		for(int i=0;i<sb.length();i++){
			if(sb.charAt(0)=='9' && i==0){
				sb1.append(9);
				continue;
			}else {
				if(Character.getNumericValue(sb.charAt(i))<=4){
					sb1.append(sb.charAt(i));
				}else{
					sb1.append(9-Character.getNumericValue(sb.charAt(i)));
				}
			}
		}
		System.out.println(sb1);
	}
}
