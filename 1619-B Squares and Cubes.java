import java.util.*;

public class SquaresAndCubes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
          while(t-->0) {
        	  int n=sc.nextInt();
        	  Set<Integer>set=new HashSet<>();
        	  for(int i=1;i<=n;i++) {
        		  if(Math.pow(i, 2)<=n) {
        			  set.add((int)Math.pow(i, 2));
        		  }else {
        			  break;
        		  }
        	  }
        	  for(int i=1;i<=n;i++) {
        		  if(Math.pow(i, 3)<=n) {
        			  set.add((int)Math.pow(i, 3));
        		  }else {
        			  break;
        		  }
        	  }
        	  System.out.println(set.size());
          }
	}

}
