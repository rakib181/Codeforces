/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class PerfactlyInperfectArray {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		int n=sc.nextInt(),cnt=0,sq=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			sq=(int)Math.sqrt(arr[i]);
			if((sq*sq)!=arr[i]){
				cnt++;
			}
		}
		if(cnt>0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		}	
	}
}
