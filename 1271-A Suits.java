import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt(),e=sc.nextInt(),f=sc.nextInt();
		if(f>e){
		double y=Math.min(b,Math.min(c,d));
		double z=d-y;
		double x=Math.min(a,z);
		System.out.println((int)(y*f)+(int)(x*e));
		}else{
			double q=Math.min(a,d);
			double g=d-q;
			double w=Math.min(b,Math.min(c,g));
			System.out.println((int)(q*e)+(int)(w*f));
			
		}
	}
}
