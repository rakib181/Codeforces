import java.util.*;
import java.util.ArrayList;

public class PerfactPermutaion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      List<Integer>list=new ArrayList<>();
      for (int i=0;i<n;i++){
          list.add(i+1);
      }
      if (n%2!=0){
          System.out.println("-1");
      }else{
          Collections.reverse(list);
          for (int x:list){
              System.out.print(x+" ");
          }
      }

    }
}
