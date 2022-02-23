import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] arr=new int[n];
			
			Set<Integer>set=new HashSet<>();
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
				set.add(arr[i]);
			}
			List<Integer>list=new ArrayList<>();
			for(int i=0;i<set.size();i++){
				list.add(set.size());
			}
			for(int i=1;i<=(n-set.size());i++){
				list.add((set.size()+i));
			}
			for(Integer x:list){
			System.out.print(x+" ");
			}
			System.out.println();
		}
	}
}
