import java.util.Scanner;

public class MinutesBeforeNewYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rem;
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int h=sc.nextInt();
            int m=sc.nextInt();
            rem=(h*60)+m-1440;
            System.out.println(Math.abs(rem));
        }
    }
}
