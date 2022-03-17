/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class Table{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(),m=sc.nextInt(),yo=0,yeh=0;
	int[][] arr=new int[n][m];
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			arr[i][j]=sc.nextInt();
			if(i==0 || i==n-1){
				if(arr[i][j]==1){
					yo=1;
				}
			}
				if(j==0 || j==m-1){
					if(arr[i][j]==1){
						yeh=1;
					}
			}	
		}
		}	
		if(yo==1 || yeh==1){
			System.out.println("2");
		}else{
			System.out.println("4");
		}
	}
}
