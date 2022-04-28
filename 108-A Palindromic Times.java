import java.util.*;

public class PalTimes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int h=Integer.parseInt(s.substring(0,2)),m=Integer.parseInt(s.substring(3));
        while (true){
            if (++m==60){
                m=0;h=++h%24;
            }
            if(m%10==h/10 && h%10==m/10){
                if(m%10==m && h%10==h){
                    System.out.println("0"+h+":"+"0"+m);
                }else if(h%10==h){
                    System.out.println("0"+h+":"+m);
                }
                else if (m%10==m){
                    System.out.println(h+":"+"0"+m);
                }else {
                    System.out.println(h + ":" + m);
                }
                return;
            }
        }
    }
}
