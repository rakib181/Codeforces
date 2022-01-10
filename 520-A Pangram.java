import java.util.HashSet;
import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        HashSet<Character> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      String s=sc.next().toLowerCase();
      for (int i=0;i<s.length();i++){
          set.add(s.charAt(i));
      }
      if (set.size()==26){
          System.out.println("YES");
      }
      else
          System.out.println("NO");
    }
}
