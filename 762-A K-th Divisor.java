import java.util.*;
public class KthDivisors{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			long n=sc.nextLong(),k=sc.nextLong(),cnt=0,i=0;
			for(i=1;i*i<=n;i++){
				if(n%i==0){
					cnt++;
				}
				if(cnt==k){
					System.out.println(i);return;
				}
			}
			i--;
			if(i*i==n){
				i--;
			}
			for(;i>=1;i--){
				if(n%i==0){
					cnt++;
				}
				if(cnt==k){
					System.out.println(n/i);return;
				}
			}
			System.out.println("-1");
	}
}
