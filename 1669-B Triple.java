import java.util.*;

public class Triple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();boolean wha=true;
            int[] arr=new int[n+1];
            int[] tmp=new int[n+1];
            Arrays.fill(tmp,0);
            for(int i=1;i<=n;i++) {
                arr[i] = sc.nextInt();
                tmp[arr[i]] = ++tmp[arr[i]];
            }
            for(int i=1;i<=n;i++){
                if(tmp[i]>=3){
                    System.out.println(i);
                    wha=false;
                    break;
                }
            }
            if (wha){
                System.out.println("-1");
            }
        }
    }
}
