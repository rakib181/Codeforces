import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            List<Integer> list=new ArrayList<>();
            int n = sc.nextInt(),c=10;
              while(n!=0){
                  int r=n%c;
                  n-=r;
                  if (r>0){
                      list.add(r);
                  }
                  c*=10;
              }
            System.out.println(list.size());
            Collections.reverse(list);
              for (int y:list){
                  System.out.print(y+" ");
              }
            System.out.println();
            }
        }
    }
