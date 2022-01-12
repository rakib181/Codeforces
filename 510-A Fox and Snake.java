import java.util.Scanner;

public class FoxAndSnakes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=m;j++){
                if(i%2!=0) {
                    System.out.print("#");
                }else{
                    if (i%4!=0){
                        if (j==m){
                            System.out.print("#");
                        }else
                            System.out.print(".");
                    }else
                    {
                        if(j==1){
                            System.out.print("#");
                        }else
                            System.out.print(".");
                    }
                }

            }
            System.out.println();
        }
    }
}
