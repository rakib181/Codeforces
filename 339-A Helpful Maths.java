import java.util.Arrays;
import java.util.Scanner;
public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        s=s.replace("+","");
      char s1[]= s.toCharArray();
        Arrays.sort(s1);
        for (int i=0;i<s1.length;i++){
            System.out.print(s1[i]);
            if (i==s1.length-1){
                continue;
            }
            System.out.print("+");
        }
    }
}
