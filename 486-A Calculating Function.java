import java.util.Scanner;

public class CalFunc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       long  a,b,x,y;
        long  n=sc.nextLong();
        if (n%2==0){
            a=n/2;
            b=n/2;
        }
        else {
            a=n/2;
            b=n/2+1;
        }
        x=a*(a+1);
        y=b*b;
        System.out.println(x-y);
    }
}
