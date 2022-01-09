import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int w,x,y,z;
       for (int i=n+1;;i++){
           w=i%10;
           x=(i/10)%10;
           y=(i/100)%10;
           z=(i/1000)%10;
           if (w!=x && w!=y && w!=z && x!=y && x!=z && y!=z){
               System.out.println(i);
               break;
           }
       }
    }
}
