import java.util.*;
public class BalancedSubstring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt(),a=0,b=0;
			StringBuilder sb=new StringBuilder(sc.next());
			for(int i=0;i<n;i++){
				if(sb.charAt(i)=='a'){
					a++;
				}else{
					b++;
				}
			}if(n==1 || a==0 || b==0){
				System.out.println("-1"+" "+"-1");
			}
		else if(a==b){
				System.out.println("1"+" "+n);
			}else{
				for(int i=0;i<n-1;i++){
					if(sb.charAt(i)=='a' && sb.charAt(i+1)=='b' || sb.charAt(i)=='b' && sb.charAt(i+1)=='a'){
						System.out.println((i+1)+" "+(i+2));
						break;
					}
				}
			}
		}
	}
}
