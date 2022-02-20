import java.util.Scanner;
public class AvoidLocalMaximums {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt(),c=0;
			int[] arr=new int[n+1];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			for(int i=1;i+1<n;i++) {
				if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
					if(i+2<n) {
					arr[i+1]=Math.max(arr[i],arr[i+2]);
				}else {
					arr[i+1]=arr[i];
				}
					c++;
			  }
			}
			System.out.println(c);
			for(int k=0;k<n;k++) {
				System.out.print(arr[k]+" ");
			}
			System.out.println();
		}

	}
}

 
