import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int x=0;x<t;x++){
            int n=sc.nextInt();
            String s=sc.next();
         if (n>2 || s.equals("00") || s.equals("11")){
             System.out.println("NO");
         }else
             System.out.println("YES");
        }
    }
}
