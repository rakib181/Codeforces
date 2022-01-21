import java.util.Scanner;

public class CasmirsStringSolitaire {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=0,b=0,c=0;
            String s=sc.next();
            char[] ch=s.toCharArray();
            for (int j=0;j<s.length();j++){
                if (ch[j]=='B'){
                    b++;
                }else if (ch[j]=='A'){
                    a++;
                }else
                    c++;
            }
            if ((a+c)==b){
                System.out.println("YES");
            }else
                System.out.println("NO");
        }
    }
}
