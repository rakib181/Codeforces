import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long x=sc.nextInt(),c=0;
		while(x>0){
			if((x&1)==1){
				c++;
			}
			x>>=1;
		}
		System.out.println(c);
	}
}
