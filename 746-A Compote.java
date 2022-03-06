import java.util.*;
public class Compote {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),sum=0;
		while(a>0 && b>1 && c>3){
			sum+=7;
			a--;b-=2;c-=4;
		}
		System.out.println(sum);
	}
}
