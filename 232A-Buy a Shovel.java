import java.util.Scanner;

public class Shovel {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int i=1,c=1;
            while ((i*a)%10!=b){
                if ((i*a)%10==0){
                    System.out.println(c);
                    return;
                }
                c++;
                i++;
            }
            System.out.println(c);
        }
}
