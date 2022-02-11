import java.util.*;
public class ModerateModularMode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (long i=0;i<t;i++) {
            long a = sc.nextLong(), b = sc.nextLong();
           if (b >= a) {
                System.out.println(b-(b%a)/2);
            } else
                System.out.println(a+b);
        }
    }
}
