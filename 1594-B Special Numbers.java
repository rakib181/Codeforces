import java.util.Scanner;

public class SpecialNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0) {
			long n=sc.nextInt(),k=sc.nextInt(),sn=0,mod=1000000007,i=1;
			while(k>0) {
				if((k&1)==1) {
					sn=(sn+i)%mod;
				}
				k>>=1;
				i=(i*n)%mod;
			}
			System.out.println(sn%mod);
		}

	}

}
