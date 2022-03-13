/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class KefaAndFirstSteps {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),cnt=1,l=0,p=0,max=-1000000007;
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		if(n==1){
			System.out.println("1");
		}else{
		while(p<n-1){
			for(int k=l;k<n-1;k++){
				if(arr[k]<=arr[k+1]){
					cnt++;
					p++;
				}else{
					l=k+1;
					p++;
					break;
				}
			}
			if(cnt>max){
				max=cnt;
			}
			cnt=1;
		}
		System.out.println(max);
	}
 }
}
