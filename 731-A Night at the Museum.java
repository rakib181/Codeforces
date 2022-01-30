import java.util.Scanner;

public class NightAtTheMuseum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int c=0;
        char ch='a';
        for(int i=0;i<s.length();i++){
            c+=Math.min(Math.abs(s.charAt(i)-ch),(26-Math.abs(s.charAt(i)-ch)));
            ch=s.charAt(i);
        }
        System.out.println(c);
    }
}
