import java.util.Scanner;

public class Splits {
    void solve(int x){
        System.out.println((x/2)+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Splits obj=new Splits();
        int n=sc.nextInt();
        obj.solve(n);

    }
}
