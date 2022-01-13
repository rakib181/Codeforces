import java.util.Scanner;

public class Laptops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++) {
            int a = sc.nextInt(), b = sc.nextInt();
              if (a!=b){
                  System.out.println("Happy Alex");
                  return;
              }
        }
        System.out.println("Poor Alex");
    }
}
