import java.util.Scanner;
public class Capitalization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      String s=sc.next();
      char []a=s.toCharArray();
      a[0]=Character.toUpperCase(a[0]);
      for (int i=0;i<s.length();i++){
          System.out.print(a[i]);
      }
    }
}




