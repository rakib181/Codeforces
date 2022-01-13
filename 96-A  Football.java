import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int max=1,c=1;
        for (int i=0;i<s.length()-1;i++) {
            while (i < s.length()-1 && s.charAt(i) == s.charAt(i + 1)) {
                c++;
                i++;
                max = Math.max(c, max);
            }
             c=1;
        }
        if (max>=7){
            System.out.println("YES");
        }else
            System.out.println("NO");
    }
    }
