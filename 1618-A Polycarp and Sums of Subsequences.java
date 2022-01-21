import java.util.Arrays;
import java.util.Scanner;

public class PolycarpAndSumsOfSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), max = 0, s = 0;
        for (int x = 0; x < t; x++) {
            int[] arr = new int[7];
            for (int i = 0; i < 7; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            max = arr[1] + arr[0];
            for (int j = 2; j < 7; j++) {
                if ((arr[6]) == arr[j] + max) {
                    s = j;
                    break;
                }
            }
            System.out.println(arr[0] + " " + arr[1] + " " + arr[s]);
        }
    }
}
