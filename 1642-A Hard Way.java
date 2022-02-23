import java.util.*;

public class HardWay {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int[][] arr=new int[3][2];
			for(int i=0;i<3;i++) {
				for(int j=0;j<2;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			if(arr[0][1]==arr[1][1] && arr[2][1]<arr[0][1]) {
				System.out.println(Math.abs(arr[0][0]-arr[1][0]));
			}
			else if(arr[0][1]==arr[2][1] && arr[1][1]<arr[0][1]) {
				System.out.println(Math.abs(arr[0][0]-arr[2][0]));
			}
			else if(arr[1][1]==arr[2][1] && arr[0][1]<arr[1][1]) {
				System.out.println(Math.abs(arr[1][0]-arr[2][0]));
			}else {
				System.out.println("0");
			}
	     }
	   }
	}
