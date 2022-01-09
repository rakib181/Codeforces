import java.util.Scanner;

public class ConstructRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x, y;
        for (int i = 0; i < n; i++) {
            int  a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            if (a == b && a == c) {
                if (a%2==0){
                    System.out.println("YES");
                    continue;
                }else {
                    System.out.println("NO");
                    continue;
                }
            }
            if (a == b) {
                if (c % 2 == 0) {
                    System.out.println("YES");
                    continue;
                } else
                    System.out.println("NO");
                continue;
            } else if (a == c) {
                if (b % 2 == 0) {
                    System.out.println("YES");
                    continue;
                } else
                    System.out.println("NO");
                continue;
            } else if (b == c) {
                if (a % 2 == 0) {
                    System.out.println("YES");
                    continue;
                } else
                    System.out.println("NO");
                continue;
            } else if (a > b && a > c) {
                x = a - b;
                y = a - c;
                if (x == c && y == b) {
                    System.out.println("YES");
                    continue;
                }
            } else if (b > a && b > c) {
                x = b - a;
                y = b - c;
                if (x == c && y == a) {
                    System.out.println("YES");
                    continue;
                }
            } else {
                x = c - a;
                y = c - b;
                if (x == b && y == a) {
                    System.out.println("YES");
                    continue;
                }
            }
            System.out.println("NO");
        }
    }
}
