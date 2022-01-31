import java.util.Scanner;

public class Minority {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int c=0,d=0;
            String s=sc.next();
             for (int j=0;j<s.length();j++){
                 if (s.charAt(j) == '0') {
                     c++;
                 }else if(s.charAt(j)=='1'){
                     d++;
                 }
             }
           if (c==d  && d==1){
               System.out.println("0");
           }
           else if (c==d){
               System.out.println(c-1);
           }
               else{
               System.out.println(Math.min(c,d));
           }
        }

    }
}
