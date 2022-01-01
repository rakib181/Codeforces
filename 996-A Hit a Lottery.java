import java.util.Scanner;
 
public class Lottery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n= sc.nextLong();
        long c=0;
        while (n>=1){
            if (n>=100){
                n -= 100;
                c++;
                continue;
            } if(n>=20){
                n -= 20;
                c++;
                continue;
            } if (n>=10){
                n -= 10;
                c++;
                continue;
            } if (n>=5){
                n -= 5;
                c++;
                continue;
            }if (n>=1){
                n -= 1;
                c++;
                continue;
            }
        }
        System.out.println(c);
    }
}
