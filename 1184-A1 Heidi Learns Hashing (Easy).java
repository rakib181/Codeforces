/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class HeidiLearnsHashing {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long n=sc.nextLong();
	if(n<=3 || (n&1)==0){
		System.out.println("NO");
	}
	else{
		System.out.println("1"+" "+(n-3)/2);
	}
	}
}
