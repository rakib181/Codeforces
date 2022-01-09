import java.util.Scanner;

public class BoringApartment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,c=0;
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            x=((n%10)-1)*10;
            if (n<=9){
              c=  x+1;
            }
            else if (n<=99){
                c=x+3;
            }
            else if (n<=999){
                c=x+6;
            }else
            {
                c=x+10;
            }
            System.out.println(c);
        }
    }
}
