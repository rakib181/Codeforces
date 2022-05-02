import java.util.*;

public class Dictionary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            if(s.charAt(0)>=s.charAt(1)) {
                System.out.println(25 * (s.charAt(0) - 'a') + (s.charAt(1) - 'a')+1);
            }else {
                System.out.println(25 * (s.charAt(0) - 'a') + (s.charAt(1) - 'a'));
            }
        }
    }
}
