import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=0;
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            String s=sc.next();
            if (s.equals("++X") || s.equals("X++")){
                x++;
                continue;
            }else
                x--;
        }
        System.out.println(x);
    }
}
