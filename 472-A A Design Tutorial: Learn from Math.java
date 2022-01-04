import java.util.Scanner;

public class LearnFromMath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i=4,j=9;
      if (n%2==0){
          n-=i;
          System.out.println(+n+" "+i);
          return;
      }else
          n-=j;
        System.out.println(+n+" "+j);
    }
}
