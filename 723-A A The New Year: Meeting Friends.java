import java.util.Arrays;
import java.util.Scanner;

public class MeetingFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=0;
        int[] a=new int[3];
        for (int i=0;i<3;i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
     for (int j=0;j<3;j++){
         x=a[2]-a[0];
     }
        System.out.println(x);
    }
}
