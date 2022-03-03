import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong(),k=sc.nextLong(),x=(n+1)/2;
		if(k<=x){
			System.out.println((2*k)-1);
		}else{
			System.out.println(2*(k-x));
		}	
	}
}
