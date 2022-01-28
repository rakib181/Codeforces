import java.util.Arrays;
import java.util.Scanner;

public class BinaryDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t =sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            String s=Integer.toString(n);
            int[] arr=new int[s.length()];
            for (int j=0;j<s.length();j++){
                arr[j]=s.charAt(j) - '0';
            }
          Arrays.sort(arr);
            System.out.println(arr[arr.length-1]);
        }
    }
}
