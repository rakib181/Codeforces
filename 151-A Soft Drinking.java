import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt(),l=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt(),p=sc.nextInt(),nl=sc.nextInt(),np=sc.nextInt();
  int x=((k*l)/nl);
  int y=c*d;
  int z=(p/np);
  int m=Math.min(x,Math.min(y,z));
        System.out.println(m/n);
    }
}
