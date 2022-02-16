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
