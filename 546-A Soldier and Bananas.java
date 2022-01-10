import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),s=0;
        for (int i=1;i<=c;i++){
            s+=a*i;
        }
        if (s-b<1){
            System.out.println("0");
        }else
        System.out.println(s-b);
    }
}
