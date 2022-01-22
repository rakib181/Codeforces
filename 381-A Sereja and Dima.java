import java.util.Scanner;

public class SerejaDima {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0,d=0,k=0,l=n-1;
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        for (int j=0;j<n;j++) {
            if (a[k] > a[l] && j % 2 == 0) {
                s += a[k];
                k++;
                continue;
            }
            if (a[k] < a[l] && j % 2 == 0) {
                s += a[l];
                l--;
                continue;
            }
            if (a[k] > a[l] && j % 2 != 0) {
                d += a[k];
                k++;
                continue;
            }
            if (a[k] < a[l] && j % 2 != 0) {
                d += a[l];
                l--;
                continue;
            }
            if (a[k] == a[l] && j % 2 != 0) {
                d += a[k];
                l--;
                continue;
            }
                s += a[k];
                break;
        }
        System.out.println(+s+" "+d);
    }
}
