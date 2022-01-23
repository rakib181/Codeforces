import java.util.Scanner;

public class MathematicalAddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            long u=sc.nextLong(),v=sc.nextLong();
            System.out.println(-(u*u)+" "+(v*v));
        }
    }
}
