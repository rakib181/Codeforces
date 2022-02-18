import java.util.Scanner;

public class FindTheArray {
    public static double solve(double x){
        double ans=Math.sqrt(x);
        return Math.ceil(ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            double n = sc.nextDouble();
            System.out.println((int) (solve(n)));
        }
    }
}
