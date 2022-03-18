/*----->Hope Can Set You Free<-----*/
import java.util.*;

public class PotionMaking {
	public static int GCD(int x,int y) {
		if(y==0) {
			return x;
		}
		return GCD(y,x%y);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int k=sc.nextInt();
			System.out.println(100/(GCD(k,100)));
		}

	}

}
