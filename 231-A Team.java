import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c=0;
        int n = sc.nextInt();
        for (int i=0;i<n;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if (x+y+z>1){
                c++;
            }
        }
        System.out.println(c);
    }
}
