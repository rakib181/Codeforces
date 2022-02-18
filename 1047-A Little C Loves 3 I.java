import java.util.*;

public class LittleCLoves3I {
    public static void solve(int n){
    if ((n-2)%3!=0){
        System.out.println("1"+" "+"1"+" "+(n-2));
    }else
        System.out.println("1"+" "+"2"+" "+(n-3));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            solve(n);
    }
}
