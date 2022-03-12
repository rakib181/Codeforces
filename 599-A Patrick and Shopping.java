/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long d1=sc.nextLong(),d2=sc.nextLong(),d3=sc.nextLong();
	System.out.println(Math.min(Math.min((d1+d2+d3),((2*d1)+(2*d2))),Math.min(((2*d1)+(2*d3)),((2*d2)+(2*d3)))));	
	}
}
