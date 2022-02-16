import java.util.Scanner;

public class FindArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int x=0;x<t;x++){
            int n=sc.nextInt(),flag=0,num=3;
            if (n>=1){
                System.out.print("2"+" ");
            }
            for (int i=2;i<=n; )
            {
                for (int j=2;j<=num/2;j++){
                    if (num%j==0){
                        flag=1;
                        break;
                    }
                }
                if (flag==0){
                    System.out.print(num+" ");
                    i++;
                }
                flag=0;
                num++;
            }
            System.out.println();
        }
    }
}
