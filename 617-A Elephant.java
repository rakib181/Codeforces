import java.util.Scanner;
public class Elephent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        if (n%5!=0){
            n/=5;
            c=n+1;
        }else
        {
            c=n/5;
        }
        System.out.println(c);
    }
}
