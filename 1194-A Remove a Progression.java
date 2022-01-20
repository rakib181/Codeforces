import java.util.Scanner;

public class RemoveProgression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int x=sc.nextInt(),n=sc.nextInt();
             int z=x+n;
            int  w=x-n;
            int f=z-w;
            System.out.println(f);
        }
    }
}
