/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class AntonAndDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long k2=sc.nextLong(),k3=sc.nextLong(),k5=sc.nextLong(),k6=sc.nextLong(),min1=0,min2=0;
		min1=Math.min(k2,Math.min(k5,k6));
		k2-=min1;
		min2=Math.min(k2,k3);
		System.out.println((256*min1)+(32*min2));	
	}
}
