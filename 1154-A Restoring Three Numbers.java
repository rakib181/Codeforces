import java.util.Scanner;

public class RestoringThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        if (a>b && a>c && a>d){
            System.out.println(+(a-b)+" "+(a-c)+" "+(a-d));
            return;
        }
        if (b>a && b>c && b>d){
            System.out.println(+(b-a)+" "+(b-c)+" "+(b-d));
            return;
        }
        if (c>a && c>b && c>d){
            System.out.println(+(c-a)+" "+(c-b)+" "+(c-d));
            return;
        }
        if (d>a && d>b && d>c){
            System.out.println(+(d-a)+" "+(d-b)+" "+(d-c));
            return;
        }
    }
}
