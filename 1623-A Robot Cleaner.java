import java.util.*;

public class RobotCleaner {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
	    int n=sc.nextInt(),m=sc.nextInt(),r1=sc.nextInt(),c1=sc.nextInt()
	    		,r2=sc.nextInt(),c2=sc.nextInt(), x=100000000,y=0,z=0;
	    if(r2>=r1) {
	    	y=Math.min(x, (r2-r1));
	    }else {
	    	y=Math.min(x,2*(n-r1)+r1-r2);
	    }if(c2>=c1) {
	    	z=Math.min(x, (c2-c1));
	    }else {
	    	z=Math.min(x,2*(m-c1)+c1-c2);
	    }
     System.out.println(Math.min(y, z));
	   }
	}

}
