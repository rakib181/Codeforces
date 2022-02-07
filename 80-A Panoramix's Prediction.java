import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		n++;
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				n++;
				i=1;
				continue;
			}
		}if(n==m){
			System.out.println("YES");
			}else{
				System.out.println("NO");
			}
	}
		}
	
