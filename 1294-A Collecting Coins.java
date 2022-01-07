import java.util.Scanner;

public class CollectingCoins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s,r;
        int t=sc.nextInt();
        for(int i = 0; i < t; i++){
            int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),n=sc.nextInt();
            int y= Math.max(a,b);
            int z= Math.max(y,c);
            n = n-(z-a);
            n = n-(z-b);
            n = n-(z-c);
            if (n>=0 && n%3==0){
                System.out.println("YES");
            }else
                System.out.println("NO");
        }
    }
}

