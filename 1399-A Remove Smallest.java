import java.util.Arrays;
import java.util.Scanner;

public class RemoveSmallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for (int i=0;i<t;i++) {
            int n=sc.nextInt(),c=0;
            int []arr = new int[n];
            for (int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            for (int k=0;k< arr.length-1;k++){
                if ((arr[k+1]-arr[k])<=1){
                    c++;
                }
            }
            if (n-c==1){
                System.out.println("YES");
            }else
                System.out.println("NO");
        }
    }
}

