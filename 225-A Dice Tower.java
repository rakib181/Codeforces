/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class DiceTower{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(),x=sc.nextInt();
	for(int i=0;i<n;i++){
		int a=sc.nextInt(),b=sc.nextInt();
		if((a==x || (7-a)==x) || b==x || (7-b)==x){
			System.out.println("NO");
			return;
		}
	}
	System.out.println("YES");		
	}
}
