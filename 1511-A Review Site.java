import java.util.*;
public class ReviewSite{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		int n=sc.nextInt(),uv=0,dv=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			if(arr[i]==1){
				uv++;
			}else if(arr[i]==2){
				dv++;
			}else{
				uv++;
			}
		}
		System.out.println(uv);
		}	
	}
}
