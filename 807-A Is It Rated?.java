import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),cnt=1000000007;boolean yo=true;
		for(int i=0;i<n;i++){
			int a=sc.nextInt(),b=sc.nextInt();
			if(a!=b){
				System.out.println("rated");
				return;
			}
			if(cnt>=a){
				cnt=a;
			}else{
				yo=false;
			}
		}
		if(!yo){
			System.out.println("unrated");
		}
		else{
			System.out.println("maybe");
		}
	}
}
