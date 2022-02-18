import java.util.Scanner;

public class DominoDisaster {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            String s=sc.next();
            char[] ch=s.toCharArray();
            for (int j=0;j<s.length();j++) {
                if (ch[j]=='D'){
                    ch[j]='U';
                }
                else if (ch[j]=='U'){
                    ch[j]='D';
                }
            }
            System.out.println(ch);
        }
    }

}
/*import java.util.Scanner;

public class DominoDisaster2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            StringBuilder sb = new StringBuilder(sc.next());
            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(i) == 'U') {
                    sb.setCharAt(i, 'D');
                } else if (sb.charAt(i) == 'D') {
                    sb.setCharAt(i, 'U');
                }
            }
            System.out.println(sb);
        }
    }
}*/

