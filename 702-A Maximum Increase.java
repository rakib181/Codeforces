import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),c=1,max=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++){
			if(arr[i]<arr[i+1]){
			c++;
			}else{
				if(max<c){
					max=c;
				}
				c=1;
			}
		}
		if(max<c){
			max=c;
			c=1;
		}
		System.out.println(max);
	}
}
