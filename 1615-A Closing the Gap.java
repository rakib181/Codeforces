import java.util.Scanner;

public class ClosingTheGap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            int n = sc.nextInt(), max = 0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                max += arr[i];
            }
            if (max % arr.length == 0) {
                System.out.println("0");
            } else
                System.out.println("1");
        }
    }
}

