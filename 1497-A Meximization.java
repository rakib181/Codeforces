/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class Meximiization {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Map<Integer,Integer>mp=new TreeMap<>();
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
				if(!mp.containsKey(arr[i])){
					mp.put(arr[i],1);
				}else{
					mp.put(arr[i],mp.get(arr[i])+1);
				}
			}
			for(int key:mp.keySet()){
					System.out.print(key+" ");
					mp.put(key,mp.get(key)-1);	
			}
			for(int key:mp.keySet()){
				for(int i=0;i<mp.get(key);i++){
					System.out.print(key+" ");
				}
			}
			System.out.println();
		}
	}
}
