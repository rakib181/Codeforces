import java.util.Scanner;

public class ParkLighting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c,k;
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int m = sc.nextInt();
            int n = sc.nextInt();
            c=m*n;
            if (c%2==0){
                k=c/2;
                System.out.println(k);
                continue;
            }else
            {
                k=c/2+1;
                System.out.println(k);
            }
        }
    }
}
