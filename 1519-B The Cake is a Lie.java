import java.util.*;
public class TheCakeIsALie {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt();
			if(((n*m)-1)==k){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}
