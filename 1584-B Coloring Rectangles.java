import java.util.Scanner;

public class ColoringRectangles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(),x=0;
        for (int i=0;i<t;i++){
            int n=sc.nextInt(),m=sc.nextInt();
            x=n*m;
        if (x%3==0){
            System.out.println(x/3);
        }else
            System.out.println(x/3+1);
        }
    }
}
