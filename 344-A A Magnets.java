import java.util.Scanner;

public class Magnet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=0;
        int n=sc.nextInt();
        int a[]=new int[n+1];
        for (int i=0;i<n;i++){
          a[i]=sc.nextInt();
        }for (int i=0;i<n;i++){
            if (a[i]==a[i+1]){
                continue;
            }
            c++;
        }
        System.out.println(c);
    }
}
