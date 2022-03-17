/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class FixYou {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		int n=sc.nextInt(),m=sc.nextInt(),cnt=0;
		for(int i=0;i<n;i++){
			StringBuilder sb=new StringBuilder(sc.next());
			if(i==(n-1)){
				for(int j=0;j<m;j++){
					if(sb.charAt(j)=='D'){
						cnt++;
					}
				}
			}
				if(sb.charAt(m-1)=='R'){
					cnt++;
				}
		
		}
			System.out.println(cnt);
		
		}	
	}
}
