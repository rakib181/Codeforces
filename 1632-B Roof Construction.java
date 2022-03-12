/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class RoofConstruction {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int t=sc.nextInt();
    	while(t-->0) {
    		int n=sc.nextInt(),k=0,yo=n-1,bit=0,one=0;
    		StringBuilder sb=new StringBuilder();
    		while(yo!=0) {
    			if((yo&1)==1) {
    				sb.append(1);
    				bit=one;
    			}else {
    				sb.append(0);
    			}
    			yo>>=1;one++;
    		}
    	     k=bit;
    		for(int i=n-1;i>=(1<<k);i--) {
    			System.out.print(i+" ");
    		}
    		for(int i=0;i<(1<<k);i++) {
    			System.out.print(i+" ");
    		}
    		System.out.println();
    	}
    }
}
