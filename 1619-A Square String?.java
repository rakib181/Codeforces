import java.util.Scanner;

public class SquareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            String s = sc.next();
            if (s.length() % 2 != 0) {
                System.out.println("NO");
            } else {
                int temp = 0, x = s.length() / 2;
                String[] s1 = new String[s.length()];
                for (int i = 0; i < s.length(); i += x) {
                    String part = s.substring(i, i + x);
                    s1[temp] = part;
                    temp++;
                }
                for (int k = 0; k < 1; k++) {
                    if (s1[k].equals(s1[k + 1])) {
                        System.out.println("YES");
                    } else
                        System.out.println("NO");
                }
            }
        }
    }
}

