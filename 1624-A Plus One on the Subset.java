import java.util.Arrays;
import java.util.Scanner;
public class PlusOneOnTheSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(),val=0;
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int [] a = new int[n];
            for (int k = 0; k < n; k++) {
                a[k] = sc.nextInt();
            }
            Arrays.sort(a);
            for (int x=0;x<a.length;x++) {
                System.out.println(a[a.length-1]-a[x]);
                break;
            }
    }
    }
}
 
