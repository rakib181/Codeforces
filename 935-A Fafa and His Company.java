import java.util.Scanner;
public class FafaAndHisCompany {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=0,x;
    int n=sc.nextInt();
    for (int i=2;i<=n;i++){
        x=n-i;
        if (x%i==0){
            c++;
        }
    }
        System.out.println(c);
    }
}
