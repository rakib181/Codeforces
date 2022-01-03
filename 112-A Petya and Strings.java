import java.util.Locale;
import java.util.Scanner;

public class PatyaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        String s1 = sc.next().toLowerCase();
      int i=0;
      while (i<s.length()){
          if (s.charAt(i)<s1.charAt(i)){
              System.out.println("-1");
              return;
          }if (s.charAt(i)>s1.charAt(i)){
              System.out.println("1");
              return;
          }
          i++;
      }
        System.out.println("0");
    }
}
