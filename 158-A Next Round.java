import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=0;
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[100];
        for (int i=1;i<=n;i++){
           a[i]=sc.nextInt();
        }
        int i=1;
        while (i<=n){
            if (a[i]>0 && a[i]>=a[k]){
                c++;
            }
            i++;
        }
        System.out.println(c);
    }
}
