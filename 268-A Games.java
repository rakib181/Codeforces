import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),c=0;
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                if (a[j] == b[k]) {
                   c++;
                }
            }
        }
        System.out.println(c);
    }
}
