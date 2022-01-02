import java.util.Scanner;

public class AddOddOrSubEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d;
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if (b>a){
                d=b-a;
                if (d%2==0){
                    System.out.println("2");
                }else
                    System.out.println("1");
            }
            else if (a>b){
                d=a-b;
                if (d%2==0){
                    System.out.println("1");
                }else
                    System.out.println("2");
            }
            else
                System.out.println("0");
        }
    }
}
