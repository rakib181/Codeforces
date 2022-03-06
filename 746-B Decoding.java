import java.util.*;
public class Decoding{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),k=n;
		StringBuilder sb=new StringBuilder(sc.next());
		StringBuilder sb1=new StringBuilder();
		for(int i=0;i<n;i++){
			if((k&1)==0){
				sb1.insert(0,sb.charAt(i));
			}else{
				sb1.append(sb.charAt(i));
			}
			k--;
		}
		System.out.println(sb1);
	}
}
