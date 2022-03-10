import java.util.*;

public class FrogJumping {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0) {
		long a=sc.nextLong(),b=sc.nextLong(),k=sc.nextLong();
		if((k&1)==0) {
			System.out.println((a*(k/2)-(b*(k/2))));
		}else {
			System.out.println((a*((k/2)+1)-(b*(k/2))));
	  	}
  	 }
	}
}
