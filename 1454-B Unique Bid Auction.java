import java.util.*;
public class UniconBidAid {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt(),min=1000000007,idx=0;
			int[] arr=new int[n];
			Map<Integer,Integer>mp=new HashMap<>();
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			for (int i=0;i<n;i++){
            if (!mp.containsKey(arr[i])){
                mp.put(arr[i],1);
            }else
            {
                mp.put(arr[i],mp.get(arr[i])+1);
            }    
			}
			for(int i=0;i<n;i++){
				if(mp.get(arr[i])==1){
					if(min>arr[i]){
						min=arr[i];
						idx=i+1;
					}
				}
			}
			if(idx!=0){
			System.out.println(idx);
			}else{
				System.out.println("-1");
			}
		}
	}
}
