import java.util.*;
public class ArpasHardExamAndMehrdadsNaiveCheat {
     public static void main(String [] args) {
    	 Scanner sc=new Scanner(System.in);
    	 int[] ans= {6,8,4,2};
    	 int n=sc.nextInt();
    	 if(n==0) {
    		 System.out.println("1");
    		 return;
    	 }
    	 int nisos=n%4;
    	 System.out.println(ans[nisos]);
     }
}
