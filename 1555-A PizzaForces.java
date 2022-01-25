import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
			long n=sc.nextLong();
			if(n%6==0){
				System.out.println((n/6)*15);
			}else if(n%6<=2 && n/6>=1){
				System.out.println((n/6)*15+5);
			}else if(n%6<=4 && n/6>=1){
				System.out.println((n/6)*15+10);
			}else{
				System.out.println((n/6)*15+15);
			}
		}
	}
}
