import java.util.Arrays;
import java.util.Scanner;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next(),s1=sc.next(),s3=sc.next();
        String k=s+s1;
      char []a=k.toCharArray();
      char []b=s3.toCharArray();
      Arrays.sort(a);
      Arrays.sort(b);
    boolean result=Arrays.equals(a,b);
    if (result){
        System.out.println("YES");

    }else
        System.out.println("NO");
    }
}
