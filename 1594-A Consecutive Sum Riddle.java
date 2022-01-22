import java.util.Scanner;

public class ConsecutiveSumRiddle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++) {
            long p = sc.nextLong();
            System.out.println(-(p-1)+" "+p);
        }
    }
}
