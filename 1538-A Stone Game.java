import java.util.*;
public class StoneGame{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt(),cntL=0,cntR=0,cntLRB=0,cntLRE=0,min=0,max=0,flagL=0,flagR=0,flagLRB=0,flagLRE=0;
			int[] arr=new int[n];
			int[] arr1=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
				arr1[i]=arr[i];
			}
			Arrays.sort(arr1);min=arr1[0];max=arr1[n-1];
			for(int i=0;i<n;i++){
				if(flagL<2){
					if(arr[i]==max || arr[i]==min){
						cntL=i+1;flagL++;
					}
				}
			}
				for(int i=n-1;i>=0;i--){
				if(flagR<2){
					if(arr[i]==max || arr[i]==min){
						cntR=n-i;flagR++;
					}
				}
			}
			for(int i=0;i<n;i++){
				if(flagLRB<1){
					if(arr[i]==max || arr[i]==min){
						cntLRB=i+1;flagLRB=1;
					}
				}
			}
			for(int i=n-1;i>=0;i--){
				if(flagLRE<1){
					if(arr[i]==max || arr[i]==min){
						cntLRE=n-i;flagLRE=1;
					}
				}
			}
			System.out.println(Math.min(cntL,Math.min(cntR,(cntLRB+cntLRE))));
		}
	}
}
