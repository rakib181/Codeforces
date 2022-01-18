import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SpecialPermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            Integer []a=new Integer[n];
            for (int k=0;k< n;k++){
                a[k]=k+1;
                }
            Collections.reverse(Arrays.asList(a));
           // System.out.println(Arrays.asList(a));
            if (n%2!=0) {
                int temp = a[n / 2];
                a[n / 2] = a[(n / 2) + 1];
                a[(n / 2) + 1] = temp;
            }
            for (int k=0;k<n;k++) {
                System.out.print(a[k]);
                if (k<n-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
