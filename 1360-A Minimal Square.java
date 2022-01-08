import java.util.Scanner;

public class MinimalSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            double a=sc.nextInt();
            double b=sc.nextInt();
            double x= Math.min(a,b);
            double y=Math.max(a,b);
            if ((x+x)>y){
                System.out.println((int)+Math.pow((x+x),2));
            }else
                System.out.println((int)+Math.pow(y,2));
        }
    }
}
