/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class NazzarAndColorfulBalls{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		int n=sc.nextInt();
		int[] arr=new int[n];
		Map<Integer,Integer>mp=new HashMap<>();
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			if(!mp.containsKey(arr[i])){
				mp.put(arr[i],1);
			}else{
				mp.put(arr[i],mp.get(arr[i])+1);
			}
		}
	int max=Collections.max(mp.values());
		System.out.println(max);
		}	
	}
}
