import java.util.*;
public class LongComparison {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			long x=sc.nextLong(),a=sc.nextLong(),y=sc.nextLong(),b=sc.nextLong();
			long mn=Math.min(a,b);
			a-=mn;b-=mn;
			if(a>=7){
				System.out.println(">");
			}else if(b>=7){
				System.out.println("<");
			}else{
			for(int i=0;i<a;i++){
				x*=10;
			}
			for(int i=0;i<b;i++){
				y*=10;
			}
			if(x<y){
				System.out.println("<");
			}else if(x>y){
				System.out.println(">");
			}else{
				System.out.println("=");
			}
			}
		}
	}
}
