/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class Distance {
	public static void yo(int a,int b) {
		if(a>=b) {
			int yo=a+b;
				System.out.println(((yo/2)-b)+" "+b);
		}else {
			int yo=a+b;
			if(b>=a) {
				System.out.println(a+" "+((yo/2)-a));
			   }
			}
	}
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
			int t=sc.nextInt();
			while(t-->0) {
				int a=sc.nextInt(),b=sc.nextInt();
				 if(((a+b)&1)!=0) {
					System.out.println("-1"+" "+"-1");
				}
				else {
					yo(a,b);
			     	}
			     }
            }
    	}
