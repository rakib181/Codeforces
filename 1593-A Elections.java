import java.util.Scanner;

public class Elections {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            int max=Math.max(a,Math.max(b,c));
            if (max==a && max==b){
                System.out.println((max+1-a)+" "+(max+1-b)+" "+(max+1-c));
            }
            else if (max==a && max==c){
                System.out.println((max+1-a)+" "+(max+1-b)+" "+(max+1-c));
            }else if (max==b && max==c){
                System.out.println((max+1-a)+" "+(max+1-b)+" "+(max+1-c));
            }else
            {
                if (max==a){
                    System.out.println("0"+" "+(a-b+1)+" "+(a-c+1));
                }else if (max==b){
                    System.out.println((b-a+1)+" "+"0"+" "+(b-c+1));
                }else
                    System.out.println((c-a+1)+" "+(c-b+1)+" "+"0");
            }
        }
    }
}
