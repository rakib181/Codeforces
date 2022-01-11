import java.util.Scanner;

public class GeorgeAccommodation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(),c=0;
        for (int i=0;i<t;i++){
            int p=sc.nextInt(),s=sc.nextInt();
            if ((p+2)<=s){
                c++;
            }
        }
        System.out.println(c);
    }
}
