import java.util.Arrays;
import java.util.Scanner;

public class DivanAndAStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), l = sc.nextInt(), r = sc.nextInt(), k = sc.nextInt(),c=0;
            int []arr=new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            int sum=0;
            for (int j =0;j<arr.length;j++){
                if (arr[j]>=l && arr[j]<=r){
                    if (sum+arr[j]<=k){
                        c++;
                        sum+=arr[j];
                    }else {
                        break;
                    }
                }
            }
            System.out.println(c);
        }
    }
}
