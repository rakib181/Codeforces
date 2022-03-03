import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt(),min=0,max=0,c=0,tmin=0,tmax=0;
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			for(int i=0;i<n-1;i++){
				min=Math.min(arr[i],arr[i+1]);
				max=Math.max(arr[i],arr[i+1]);
				tmin=min;
				tmax=max;
				while(tmin<tmax){
					if(tmin*2<tmax){
					c++;
					tmin*=2;	
			}else{
				break;
			}
			}
			}
			System.out.println(c);
		}
	}
}
