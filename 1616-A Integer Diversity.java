import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class IntegerDiversity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            HashSet<Integer> set = new HashSet<>();
            Arrays.sort(arr);
            if (arr.length == 1) {
                System.out.println("1");
            } else {
                for (int k = 0; k < n - 1; k++) {
                    if (arr[k] == arr[k + 1] && arr[k] > 0) {
                        set.add(arr[k]);
                        set.add(-arr[k]);
                    } else if (arr[k] == arr[k + 1] && arr[k] < 0) {
                        set.add(arr[k]);
                        set.add(-arr[k]);
                    } else {
                        set.add(arr[k]);
                        set.add(arr[k + 1]);
                    }
                }
                System.out.println(set.size());
            }
        }
    }
}
