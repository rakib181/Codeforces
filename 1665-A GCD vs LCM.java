import java.util.*;

public class GCDvsLCM {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt(),k=n-2;
			if((k&1)==1) {
				System.out.println((k/2)+" "+(k-(k/2))+" "+"1"+" "+"1");
			}else {
					System.out.println(("1"+" "+(k-1)+" "+"1"+" "+"1"));
			}
		}
	}
}
