import java.util.HashSet;
import java.util.Scanner;

public class IWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> h=new HashSet<Integer>();
        int n=sc.nextInt();
        int p=sc.nextInt();
        for (int i=0;i<p;i++){
            int s=sc.nextInt();
            h.add(s);
        }
        int q=sc.nextInt();
        for (int j=0;j<q;j++) {
            int t = sc.nextInt();
            h.add(t);
        }
        if (h.size()==n){
            System.out.println("I become the guy.");
        }else
            System.out.println("Oh, my keyboard!");

    }
}
