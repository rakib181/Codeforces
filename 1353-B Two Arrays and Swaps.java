import java.util.Arrays;
import java.util.Scanner;

public class TwoArraysAndSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            int n = sc.nextInt(), k = sc.nextInt(), c = 0, m = 0,d=0;
            int[] a = new int[n];
            int[] b = new int[n];
            for (int p = 0; p < n; p++) {
                a[p] = sc.nextInt();
            }
            for (int e = 0; e < n; e++) {
                b[e] = sc.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            for (int r=0;r<k;r++) {
                if (b[n-r-1]>a[r]) {
                        int temp = a[r];
                        a[r] = b[n - r - 1];
                        b[n - r - 1] = temp;
                }
            }
            for (int x = 0; x < n; x++) {
                c += a[x];
            }
            System.out.println(c);
        }
    }
}

