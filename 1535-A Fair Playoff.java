import java.util.Scanner;

public class FairPlayoff {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt(),x,y,z,k;
        for(int i=0;i<t;i++){
            int s1=sc.nextInt(),s2=sc.nextInt(),s3=sc.nextInt(),s4=sc.nextInt();
            x=Math.max(s1,s2);
            y=Math.max(s3,s4);
            z=Math.min(s1,s2);
            k=Math.min(s3,s4);
            if (x>y || y>x){
               if (k>x || z>y){
                   System.out.println("NO");
               }else
                   System.out.println("YES");
            }
        }
    }
}
