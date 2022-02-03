import java.util.*;
import java.util.ArrayList;

public class HonestCoach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int x=0;x<t;x++){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            List<Integer> list=new ArrayList<>();
          for (int j=0;j<n-1;j++){
              list.add(arr[j+1]-arr[j]);
          }
            Collections.sort(list);
            System.out.println(list.get(0));
        }
    }
}
