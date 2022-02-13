import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DownloadMoreRAM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int x=0;x<t;x++){
            int n=sc.nextInt(),k=sc.nextInt();
            List<Integer> list=new ArrayList<>();
            List<Integer>list1=new ArrayList<>();
            for (int i=0;i<n;i++){
                list.add(sc.nextInt());
            }
            for (int i=0;i<n;i++){
                list1.add(sc.nextInt());
            }
            for (int i=0;i<n;i++){
                if (list.get(i)<=k){
                    k+=list1.get(i);
                  list.remove(i);
                  list1.remove(i);
                  i=-1;
                  n--;
                }
            }
            System.out.println(k);
        }
    }
}
