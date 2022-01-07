import java.util.Scanner;

public class VasyaTheHipster {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s;
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b){
            System.out.println(a+" "+"0");
        }else if (a>b){
            s=(a-b)/2;
            System.out.println(b+" "+s);
        }else{
            s=(b-a)/2;
            System.out.println(a+" "+s);
        }
    }
}
