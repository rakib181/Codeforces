import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		while(q-->0)
		{
			int n=sc.nextInt(),flag=0;
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			for(int i=0;i<n-1;i++){
				if(Math.abs(arr[i]-arr[i+1])==1){
					flag=1;
					break;
				}
			}
			if(flag==1){
				System.out.println("2");
			}else{
				System.out.println("1");
			}
		}
	}
}
