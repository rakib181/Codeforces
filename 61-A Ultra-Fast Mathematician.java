import java.util.Scanner;

public class Mathematician {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.next();
        String y=sc.next();
        char a[]=x.toCharArray();
        char b[]=y.toCharArray();
        for (int i=0;i<a.length;i++){
            if (x.charAt(i)==y.charAt(i)){
                System.out.print("0");
            }else
                System.out.print("1");
        }
    }
}
