import java.util.Scanner;

public class XYSequence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt(),B=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt();
			int[] arr=new int[n+1];
			arr[0]=0;long sum=0;
			for(int i=1;i<n+1;i++) {
				if(x+arr[i-1]>B) {
					arr[i]=arr[i-1]-y;
				}else {
					arr[i]=arr[i-1]+x;
				}
				sum+=arr[i];	
			}
			System.out.println(sum);
		}
	}
}
