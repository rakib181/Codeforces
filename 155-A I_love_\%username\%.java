
import java.util.Scanner;

public class ILoveUsername {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), c = 0, d = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int j = 0; j < n; j++) {
            if (max < arr[j]) {
                c++;
                max = arr[j];
            }
        }
        int min = arr[0];
        for (int j = 0; j < n; j++) {
            if (min > arr[j]) {
                d++;
                min = arr[j];
            }
        }

        System.out.println(c + d);
    }
}
