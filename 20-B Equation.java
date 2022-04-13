import java.util.*;
public class Equation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble();
		if(a==0) {
			if(b==0) {
				System.out.println(c==0?"-1":"0");
			}else {
				System.out.println("1");
				System.out.println(String.format("%.10f", (double)(-c/b)));
			}
		}else {
			double x=((b*b)-(4*a*c));
			if(x<0) {
				System.out.println("0");
			}else if(x==0) {
				System.out.println("1");
				System.out.println(String.format("%.10f",(double)-b/(2*a)));
			}else {
				System.out.println("2");
				System.out.println(String.format("%.10f",Math.min((double)((-b-Math.sqrt(x))/(2*a)),(double)((-b+Math.sqrt(x))/(2*a)))));
				System.out.println(String.format("%.10f",Math.max((double)((-b-Math.sqrt(x))/(2*a)),(double)((-b+Math.sqrt(x))/(2*a)))));
			}
		}
	}
}
