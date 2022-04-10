import java.util.*;
public class SubtractOperation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
		int n=sc.nextInt(),k=sc.nextInt();
		int[] arr=new int[n];
		Set<Integer>set=new HashSet<>();
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		    set.add(arr[i]);
		}
		boolean yo=false;
	     for(int i=0;i<n;i++) {
	    	 if(set.contains(arr[i]+k)) {
	    		 yo=true;
	    		 System.out.println("YES");
	    		 break;
	    	 }
	     }
	     if(!yo) {
	    	 System.out.println("NO");
	     }
	  }
	}
}
