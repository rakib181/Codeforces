import java.util.*;

public class IntegerMoves {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int x=sc.nextInt(),y=sc.nextInt();
			int k=(int)Math.sqrt((Math.pow(x, 2)+Math.pow(y,2)));
			if(x==0 && y==0) {
				System.out.println("0");
			}else if(Math.pow(k, 2)==Math.pow(x,2)+Math.pow(y, 2)) {
				System.out.println("1");
			}else {
				System.out.println("2");
			}
		}
	}
}
