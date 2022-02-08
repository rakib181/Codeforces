import java.util.*;
import java.util.ArrayList;

public class FortuneTelling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            long n=sc.nextLong(),x=sc.nextLong(),y=sc.nextLong(),c=0;
            List<Long>list=new ArrayList<>();
            for (int j=0;j<n;j++){
                list.add(sc.nextLong());
                c^=list.get(j);
            }
            if((x^c)%2==y%2){
                System.out.println("Alice");
            }else {
                System.out.println("Bob");
            }
        }
    }
}
