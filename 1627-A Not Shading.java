/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class NotShading {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0) {
		int n=sc.nextInt(),m=sc.nextInt(),r=sc.nextInt(),c=sc.nextInt(),yo=0,jaigamoto=0,ashepase=0;
		for(int i=0;i<n;i++) {
			StringBuilder sb=new StringBuilder(sc.next());
			for(int k=0;k<sb.length();k++){
					if(sb.charAt(k)=='B') {
						yo=1;
					}
				if(i==r-1) {
						if(sb.charAt(k)=='B') {
							ashepase=1;
						}	
				}else {

						if(k==c-1) {
							if(sb.charAt(k)=='B') {
								ashepase=1;
							}
						}
				}
				if(i==r-1 && k==c-1) {
					if(sb.charAt(k)=='B') {
						jaigamoto=1;
					}
				}
			}		
		}
		if(jaigamoto==1) {
			System.out.println("0");
		}else if(ashepase==1) {
			System.out.println("1");
		}else if(yo==1) {
			System.out.println("2");
		}else {
			System.out.println("-1");
		}
	}
	}
}
