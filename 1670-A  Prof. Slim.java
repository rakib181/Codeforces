import java.util.*;

public class ProfSlim {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),neg=0;boolean YES=true;
            int[] arr=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]<0){
                    neg++;
                }
                arr[i]=Math.abs(arr[i]);
            }
            if(n==1){
                System.out.println("YES");
                continue;
            }
            for(int i=0;i<neg;i++){
                arr[i]=-arr[i];
            }
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    YES=false;
                    break;
                }
            }
            System.out.println(YES?"YES":"NO");
        }
    }
}
