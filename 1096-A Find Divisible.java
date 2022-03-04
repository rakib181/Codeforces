import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			long l=sc.nextLong(),r=sc.nextLong();
			if(l==1){
				System.out.println(l+" "+(l+1));
			}else{
				System.out.println(l+" "+(2*l));
			}
		}
	}
}
