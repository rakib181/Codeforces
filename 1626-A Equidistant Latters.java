import java.util.Arrays;
import java.util.Scanner;

public class EquidistantLatters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++) {
            String s = sc.next();
            char[] a = s.toCharArray();
            Arrays.sort(a);
            for (int j=0;j<s.length();j++){
                System.out.print(a[j]);
            }
            System.out.println();
        }
    }
}
