import java.util.*;

public class FloorNumber {
    static double solve(double n,double x){
        if (n<3){
            return 1;
        }else {
            return Math.floor(((n - 3)/ x) + 2);
        }
    }
    static double solve1(double n,double x){
        double c=2,ans=1;
        while (c<n){
            c+=x;
            ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            double n=sc.nextInt(),x=sc.nextInt();
           // System.out.println((int)solve(n,x));
            System.out.println((int)solve1(n,x));
        }
    }
}

