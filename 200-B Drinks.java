import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       double x=0, c=0;
         double n = sc.nextInt();
        for (double i=0;i<n;i++){
            double p =sc.nextInt();
            x=p/100;
            c+=x;
        }
        System.out.printf("%.12f",(c/n)*100);
    }
}
