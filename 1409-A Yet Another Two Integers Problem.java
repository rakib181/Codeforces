import java.util.Scanner;

public class YetAnotherTwoIntPboblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c;
        int t = sc.nextInt();
        for (int i=0;i<t;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a > b) {
                a-=b;
                c = a / 10;
                if (a%10==0){
                    System.out.println(c);
                }else
                System.out.println(c+1);
            } else if (b > a) {
                b -= a;
                c = b / 10;
                if (b%10==0){
                    System.out.println(c);
                }else
                    System.out.println(c+1);

            } else
                System.out.println("0");
        }
    }
}

