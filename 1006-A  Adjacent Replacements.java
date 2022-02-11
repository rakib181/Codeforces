import java.util.*;

public class AdjacentReplacements {
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		List<Integer>list=new ArrayList<>();
		for(int j=0;j<n;j++) {
			if(arr[j]%2==0) {
				list.add(arr[j]-1);
			}else {
				list.add(arr[j]);
			}
		}
		for(Integer k:list){
			System.out.print(k+" ");
		}	
	}
	public static void main(String[] args) {
		AdjacentReplacements obj=new AdjacentReplacements();
		obj.solve();
	}
}
