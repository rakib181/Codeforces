import java.util.Scanner;
public class BearAndBigBro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int c=0;
        while (y>=x){
            x *=3;
            y *=2;
            c++;
        }
        System.out.println(c);
    }
}
