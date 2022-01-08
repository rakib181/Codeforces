import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
          if (a%b==0){
                System.out.println("0");
            }else{
                  c=a%b;
                  c=b-c;
                System.out.println(c);
            }
        }
    }
}
