import java.util.Arrays;
import java.util.Scanner;

public class HolidayOfEquality {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=0,s;
        int t=sc.nextInt();
        int a[]=new int[t];
        for (int i=0;i<t;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for (int j=0;j<a.length;j++){
            s=a[a.length-1];
            if (a[j]==s){
                continue;
            }else
            c+=s-a[j];
        }
        System.out.println(c);
    }
}
