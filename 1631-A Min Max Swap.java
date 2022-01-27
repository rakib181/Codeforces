import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSwap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            for (int j=0;j<n;j++){
                a[j]=sc.nextInt();
            }
            for (int k=0;k<n;k++){
                b[k]=sc.nextInt();
            }
            for (int x=0;x<n;x++){
                if (a[x]<b[x]){
                    int temp=a[x];
                    a[x]=b[x];
                    b[x]=temp;
                }
            }
            Arrays.sort(a);
            Arrays.sort(b);
            System.out.println(a[a.length-1]*b[b.length-1]);
        }
    }

}
