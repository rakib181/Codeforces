import java.util.*;
import java.util.ArrayList;

public class SortingParts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            List<Integer>list=new ArrayList<>();
            List<Integer>list1=new ArrayList<>();
            for (int j=0;j<n;j++){
               list.add(sc.nextInt());
              list1.add(list.get(j));
            }
            Collections.sort(list1);
          if (list1.equals(list)){
               System.out.println("NO");
           }else{
               System.out.println("YES");
           }
        }
    }
}
