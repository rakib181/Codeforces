import java.util.Scanner;

public class LeftRightAmbidexters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt(),r=sc.nextInt(),a=sc.nextInt(),x;
        if ((l==0 || r==0) && a==0){
            System.out.println("0");
        }else if (l+a<=r){
            System.out.println((l+a)*2);
        }else if (r+a<=l){
            System.out.println((r+a)*2);
        }
        else
        {
            x=(l+r+a)/2;
            System.out.println(x*2);
        }
    }
}
