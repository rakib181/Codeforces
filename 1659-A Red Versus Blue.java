import java.util.*;
public class RedvBlue{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		int n=sc.nextInt(),r=sc.nextInt(),b=sc.nextInt(),cnt=0;
		cnt=r%(b+1);
		for(int i=0;i<(b+1);i++){
			for(int j=0;j<r/(b+1);j++){
				System.out.print("R");
			}
			if(cnt>0){
				  System.out.print("R");
				  cnt--;
			}
			if(i<b){
				System.out.print("B");
			}
		}
		System.out.println();
		}	
	}
}
