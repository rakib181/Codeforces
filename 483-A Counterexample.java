import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long l=sc.nextLong(),r=sc.nextLong();
		if((r-l)<2 || (l&1)==1 && (r-l)<3){
			System.out.println("-1");
		}else if((l&1)==0){
		System.out.println(l+" "+(l+1)+" "+(l+2));
		}else{
			System.out.println((l+1)+" "+(l+2)+" "+(l+3));
		}
	}
}
