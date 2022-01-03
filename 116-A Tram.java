import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d,c=0,e=0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
          d=b-a;
          c+=d;if (e<c){
              e=c;
            }
        }
        System.out.println(e);
    }
}
