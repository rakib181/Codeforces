import java.util.Scanner;

public class AMDeviation {

	public AMDeviation(int[] x) {
		int q=Math.abs((x[0]+x[2])-(2*x[1]));
		if(q%3==0) {
			System.out.println("0");
		}else {
			System.out.println("1");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int[] arr=new int[3];
		for(int i=0;i<t;i++) {
			for(int j=0;j<3;j++) {
			arr[j]=sc.nextInt();
			}
			AMDeviation obj=new AMDeviation(arr);
		}
	}
}
