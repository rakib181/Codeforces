import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt(),zero=0;
			StringBuilder sb=new StringBuilder(sc.next());
			for(int i=0;i<n;i++){
				if(sb.charAt(i)=='0'){
					zero++;
				}
			}
			if(zero==1){
				System.out.println("BOB");
			}
		else if((zero&1)==0){
				System.out.println("BOB");
			}else{
				System.out.println("ALICE");
			}
		}
	}
}
