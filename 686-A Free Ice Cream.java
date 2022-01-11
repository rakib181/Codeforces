import java.util.Scanner;

public class FreeIceCream {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextInt(),x=sc.nextInt(),c=0;
        for (int i=0;i<t;i++){
            String a=sc.next();
            int b=sc.nextInt();
            if (a.equals("+")){
                x += b;
                continue;
            }
            if (a.equals("-")){
                if (x-b>=0) {
                    x -= b;
                }
                else{
                    c++;
                }
            }
        }
        System.out.println(x+" "+c);
    }
}
