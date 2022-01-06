import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int u=0,l=0;
        char s1[]=s.toCharArray();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)>='A' && s.charAt(i)<='Z'){
                u++;
            }
            if (s.charAt(i)>='a' && s.charAt(i)<='z'){
                  l++;
            }
        }
        if (u>l){
            System.out.println(s.toUpperCase());
        }else
            System.out.println(s.toLowerCase());
    }
}
