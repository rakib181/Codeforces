import java.util.*;

public class BusToUdayland {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),flag=0;
		List<String> list=new ArrayList<>();
        for(int i=0;i<n;i++) {
        	StringBuilder sb=new StringBuilder(sc.next());        	
        	for(int j=1;j<5;j++) {
        		if(sb.charAt(j)=='O' && sb.charAt(j-1)=='O' && flag==0) {
        			flag=1;sb.setCharAt(j, '+');
        			sb.setCharAt(j-1, '+');
        		}	
        	}
        	list.add(sb.toString());
        }
    	if(flag==1) {
    		System.out.println("YES");
    	for(String x:list) {
    		System.out.println(x);
    	   }
    	}else {
    		System.out.println("NO");
    	}
	}

}
