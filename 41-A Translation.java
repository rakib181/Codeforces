import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next(),s1=sc.next();
        StringBuilder obj=new StringBuilder(s1);
        String x= String.valueOf(obj.reverse());
         if (x.equals(s)){
             System.out.println("YES");
         }else
             System.out.println("NO");
    }
}
