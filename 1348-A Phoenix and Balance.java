import java.util.Scanner;

public class PhoenixBalance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double c,s=0;
        double t=sc.nextInt();
        for (double i=0;i<t;i++) {
            double n = sc.nextInt();
            for (double j = 1; j <= n / 2; j++) {
                c=Math.pow(2,j);
                s+=c;
            }
            System.out.println((int)+s);
            s=0;
        }
    }
}

