/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class LastMunitesEnhancement{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		int n=sc.nextInt();
		int[] arr=new int[n];
		Set<Integer>set=new HashSet<>();
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			if(set.contains(arr[i])){
				set.add(arr[i]+1);
			}else{
				set.add(arr[i]);
			}
		}
		System.out.println(set.size());
		}	
	}
}
