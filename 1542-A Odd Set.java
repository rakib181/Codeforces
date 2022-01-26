import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
			int n=sc.nextInt(),c=0,d=0;
			int[] a=new int[n*2];
			for(int j=0;j<n*2;j++){
				a[j]=sc.nextInt();
			}
			for(int k=0;k<n*2;k++){
				if(a[k]%2==0){
					c++;
				}else if(a[k] % 2 !=0){
					d++;
				}
			}
			if(c==d){
				System.out.println("YES");
			}else{
			System.out.println("NO");
			}
		}
	}
}
