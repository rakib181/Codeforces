/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class Arena {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		int n=sc.nextInt(),cnt=1;
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=1;i<n;i++){
			if(arr[0]==arr[i]){
				cnt++;
			}else{
				break;
			}
		}
		System.out.println(n-cnt);
		}	
	}
}
