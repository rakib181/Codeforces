import java.util.Scanner;

public class CardsForFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(),s=1;
            if (a%2!=0 && b%2!=0){
                if(c==1){
                    System.out.println("YES");

                }else {
                    System.out.println("NO");
                }
                continue;
            }
            while (a%2==0){
                a/=2;
                s *= 2;
            }
            while (b%2==0){
                b/=2;
                s *=2;
            }
            if (s>=c){
                System.out.println("YES");
        }else
                System.out.println("NO");
      }
    }
}
