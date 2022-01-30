import java.util.Scanner;

public class MakeEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int x=0;x<t;x++) {
            String s = sc.next();
            char[] ch=s.toCharArray();
         if ((ch[s.length()-1]-'0')%2==0){
                System.out.println("0");
            }
            else if ((ch[0]-'0')%2==0){
                System.out.println("1");
            }else
            {
                int c=0;
                for (int i=0;i<s.length();i++){
                    if ((ch[i]-'0')%2==0){
                        c++;
                    }
                }
                if (c>0){
                    System.out.println("2");
                }else
                    System.out.println("-1");
            }
           }
        }
    }

