import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt();
		if(n<=m && n<=k){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
