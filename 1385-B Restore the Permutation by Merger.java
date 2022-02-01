import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RestoreThePermutationByMerger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            HashSet<Integer> set=new LinkedHashSet<>();
            for (int j=0;j<n*2;j++){
                set.add(sc.nextInt());
            }
            for (int x:set) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
