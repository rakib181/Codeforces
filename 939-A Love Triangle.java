import java.util.*;

public class LoveTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        for (int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=1;i<=n;i++){
            if (arr[arr[arr[i]]]==i){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
