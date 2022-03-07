import java.util.*;
public class RedAndBlueBeans {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		int r=sc.nextInt(),b=sc.nextInt(),d=sc.nextInt(),min=0,max=0;
		min=Math.min(r,b);
		max=Math.max(r,b);
	if(max%min!=0){
		if(Math.abs(1-((max/min)+1))<=d){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}	
	}else{
		if(Math.abs(1-(max/min))<=d){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}	
	}
	}
	}
}
