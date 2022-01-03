import java.util.Scanner;

public class WayToLongWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            String s= sc.next();
            if (s.length()<=10){
                System.out.print(s);
            }else {
char a=s.charAt(0);
int b=s.length()-2;
char c=s.charAt(s.length()-1);

                System.out.print(a);
                System.out.print(b);
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
