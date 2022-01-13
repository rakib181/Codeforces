import java.util.Scanner;

public class SpyDetected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), max = 0;
            int[] a = new int[n];
            for (int j = 0; j < a.length; j++) {
                a[j] = sc.nextInt();
            }
            for (int k=0;k<n;k++) {
                for (int j = k+1; j < n; j++) {
                    if (a[k] == a[j]) {
                        max = a[j];
                    }
                }
            }
            for (int j=0;j<n;j++){
                if (a[j]!=max){
                    System.out.println(j+1);
                }
            }
        }
    }
}

