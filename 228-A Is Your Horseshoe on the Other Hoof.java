import java.util.HashSet;
import java.util.Scanner;

public class IsYourHorseshoeOnTheOtherHoof {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer>set=new HashSet<>();
        int  a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);
        int x= set.size();
        System.out.println(4-x);

    }
}
