import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),t=sc.nextInt();
		StringBuilder sb=new StringBuilder();
		if(n==1 && t>9){
			System.out.println("-1");
		}else{
			if(t<10){
		for(int i=0;i<n;i++){
			sb.append(t);
		}
			}else{
				for(int i=0;i<n-1;i++){
					sb.append(1);
				}
				sb.append(0);
			}
		System.out.println(sb);
		}
	}
}
