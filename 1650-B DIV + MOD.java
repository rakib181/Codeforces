import java.util.*;
public class DivMod {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		int l=sc.nextInt(),r=sc.nextInt(),a=sc.nextInt(),ans=0,m=0;
		ans=(r/a)+(r%a);
		m=r/a*a-1;
		if(m>=l){
			ans=Math.max(ans,(m/a)+(m%a));
		}
		System.out.println(ans);
		}	
	}
}
