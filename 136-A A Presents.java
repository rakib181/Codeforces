import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int [] i=new int[100];
        int [] p=new int[100];
        int k=1;
        while(k<=n)
        {
            i[k] = sc.nextInt();
            p[i[k]]=k;
            k++;
        }
        int j=1;
        while(j<=n)
        {
            System.out.print(+p[j]+" ");
            j++;
        }
    }
}
