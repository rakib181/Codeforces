import java.util.*;

public class YoungPhysicist {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),x=0,y=0,z=0;
		int[][] arr=new int[n][3];
		for(int i=0;i<n;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=sc.nextInt();
				if(j==0) {
					x+=arr[i][j];
				}else if(j==1){
					y+=arr[i][j];
				}else {
					z+=arr[i][j];
				}
			}
		}
		if(x==0 && y==0 && z==0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
