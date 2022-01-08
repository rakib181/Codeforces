import java.util.Scanner;

public class NawYearAndHurry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextInt();
        double p=0,c=0,s=0;
        double t=sc.nextInt();
        for (double i=1;i<=n;i++) {
            s+=5*i;
            p = (s + t) / 60;
            if (p>4) {
                break;
            }
            c++;
        }
        System.out.println((int)c);
    }
}
