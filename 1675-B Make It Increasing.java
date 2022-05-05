import java.util.Scanner;

public class MakeItIncreasing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),ans=0;
            long[] arr=new long[n+1];
            for(int i=1;i<=n;i++){
                arr[i]=sc.nextInt();
            }
           while (n>=2){
               if(arr[n]==0){
                   ans=-1;
                   break;
               }
               while (arr[n-1]>=arr[n]){
                   arr[n-1]>>=1;
                   ans++;
               }
               n--;
           }
            System.out.println(ans);
        }
    }
}
