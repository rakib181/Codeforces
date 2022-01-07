import java.util.Scanner;

public class RequiredRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s;
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            s=((c/a)*a)+b;
            if (s>c){
                System.out.println(s-a);
                continue;
            }else
                System.out.println(s);
        }
    }
}
