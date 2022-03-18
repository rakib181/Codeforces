/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class SpaceNavigatiin{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		int x=sc.nextInt(),y=sc.nextInt(),cntx=0,cnty=0;
StringBuilder sb=new StringBuilder(sc.next());
		if(x>=0 && y>=0){
			for(int i=0;i<sb.length();i++){
				if(sb.charAt(i)=='R'){
					cntx++;
				}else if(sb.charAt(i)=='U'){
					cnty++;
				}
			}
		}else if(x<=0 && y<=0){
			for(int i=0;i<sb.length();i++){
				if(sb.charAt(i)=='L'){
					cntx++;
				}else if(sb.charAt(i)=='D'){
					cnty++;
				}
			}
		}else if(x<=0 && y>=0){
			for(int i=0;i<sb.length();i++){
				if(sb.charAt(i)=='L'){
					cntx++;
				}else if(sb.charAt(i)=='U'){
					cnty++;
				}
			}
		}else if(x>=0 && y<=0){
			for(int i=0;i<sb.length();i++){
				if(sb.charAt(i)=='R'){
					cntx++;
				}else if(sb.charAt(i)=='D'){
					cnty++;
				}
			}
		}if(x==0 && cnty>=Math.abs(y)){
			System.out.println("YES");
		}else if(y==0 && cntx>=Math.abs(x)){
			System.out.println("YES");
		}
		else if(Math.abs(x)<=cntx && Math.abs(y)<=cnty && x!=0 && y!=0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		}	
	}
}
