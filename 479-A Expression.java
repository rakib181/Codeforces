import java.util.*;
public class Expression {
	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int x=sc.nextInt(),y=sc.nextInt(),z=sc.nextInt();
     System.out.println(Math.max((x*y*z), Math.max(x*(y+z), Math.max((x+y+z), z*(x+y)))));
	}
}
 
