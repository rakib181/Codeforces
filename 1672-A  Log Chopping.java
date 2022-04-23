import java.util.*;
public class LogChopping {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt(),sum=0;
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
				sum+=arr[i]-1;
			}
			System.out.println((sum&1)==0?"maomao90":"errorgorn");
		}
	}
}
