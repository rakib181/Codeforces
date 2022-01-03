import java.util.Scanner;

public class CandiesTwoSisters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            if (n<3){
                System.out.println("0");
            }else if (n%2!=0){
                n=n/2;
                System.out.println(n);
            }else
            {
                n=n/2-1;
                System.out.println(n);
            }
        }
    }
}
