import java.util.Scanner;
public class InsomniaCure {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=0;
        int k=sc.nextInt();
        int l=sc.nextInt();
        int m=sc.nextInt();
        int n=sc.nextInt();
        int d=sc.nextInt();
        for (int i=1;i<=d;i++){
            if (i%k==0){
                continue;
            }
            if (i%l==0){
                continue;
            }
            if (i%m==0){
                continue;
            }
            if (i%n==0){
                continue;
            }
            c++;
        }
        System.out.println(d-c);
    }
}
