import java.util.*;

public class NumberTransformation {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt(),y=sc.nextInt();
          if((y%x)!=0){
              System.out.println("0"+" "+"0");
          }else {
              System.out.println("1"+" "+(y/x));
          }
        }
    }
}
