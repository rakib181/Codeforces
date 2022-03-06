import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			StringBuilder sb=new StringBuilder(sc.next());
			StringBuilder sb1=new StringBuilder();
			for(int i=0;i<n;i++){
				if(sb.charAt(n-1)=='0'){
					sb1.append(0);
				}else{
					sb1.append(1);
				}
			}
			System.out.println(sb1);
		}
	}
}
