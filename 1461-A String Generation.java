import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int k=sc.nextInt(),n=sc.nextInt();
			StringBuilder sb=new StringBuilder(k);
			for(int i=0;i<n;i++){
				sb.append("a");
			}
			for(int i=0;i<k-n;i++){
				if((i%3)==0){
					sb.append("c");
				}else if((i%3)==1){
					sb.append("b");
				}else if((i%3)==2){
					sb.append("a");
				}
				}
			System.out.println(sb);
		}
	}
}
