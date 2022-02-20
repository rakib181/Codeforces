import java.util.*;

public class FavSeq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),s=1,e=n;
            int[] arr=new int[n+1];
            int[] arr1=new int[n+1];
            for (int i=1;i<=n;i++){
                arr[i]=sc.nextInt();
            }
            for (int i=1;i<=n;i++){
                if ((i&1)==1){
                    arr1[i]=arr[s];
                    s++;
                }else {
                    arr1[i]=arr[e];
                    e--;
                }
            }
            for (int i=1;i<=n;i++){
                System.out.print(arr1[i]+" ");
            }
            System.out.println();
        }
    }
}
