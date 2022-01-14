import java.util.Scanner;

public class ThreePairwiseMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(),max;
            max=Math.max(Math.max(a,b),c);
             if (max==a && max==b && max==c){
                 System.out.println("YES");
                 System.out.println(a+" "+b+" "+c);
             }else if (max==a && max==c){
                 System.out.println("YES");
                 System.out.println(a+" "+b+" "+(b%a));
             }else if (max==a && max==b){
                 System.out.println("YES");
                 System.out.println(a+" "+c+" "+(c%a));
             }else if (max==b && max==c){
                 System.out.println("YES");
                 System.out.println(b+" "+a+" "+(a%b));
             }else
             {
                 System.out.println("NO");
             }
        }
    }
}
