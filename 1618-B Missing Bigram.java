import java.util.Scanner;

public class MissingBiagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         while(t-->0) {
        	 int n=sc.nextInt(),flag=0;
        	 String[] s=new String[n-2];
        	 for(int i=0;i<n-2;i++) {
        		 s[i]=sc.next();
        	 }
        	 String ans="";
        	 ans+=s[0];
        	 for(int i=1;i<n-2;i++) {
        		 if(ans.charAt(ans.length()-1)==s[i].charAt(0)) {
        			 ans+=s[i].charAt(1);
        		 }else {
        			 flag=1;
        			 ans+=s[i];
        		 }
        	 }
        	 if(flag==0) {
        		 ans+="a";
        		 System.out.println(ans);
        	 }else {
        		System.out.println(ans); 
        	 }
         }
	}

}
