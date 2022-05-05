import java.util.*;

public class DetectiveTask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            char[] ch=s.toCharArray();int n=ch.length,l=0,r=n;
            for (int i=0;i<n;i++){
                if(ch[i]=='1'){
                    l=i;
                }
                if(ch[i]=='0' && r==n){
                    r=i+1;
                }
            }
            System.out.println(r-l);
        }
    }
}
