import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class QnQ {
    static Random rand=new Random();
    static void ruffleSort(int[] arr,int n){
        for(int i=0;i<n;i++){
            int j= rand.nextInt(n-1);
            int tmp=arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
        }
        Arrays.sort(arr);
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        out=new PrintWriter(new BufferedOutputStream(System.out));
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            ruffleSort(arr,n);
            long ls=0,rs=0;
            int mid=n>>1;
            for(int i=0;i<=mid;i++){
                ls+=arr[i];
            }
            for(int i=n-1;i>mid;i--){
                rs+=arr[i];
            }
            if((n&1)==0){
                ls-=arr[mid];
            }
            out.println(rs>ls?"YES":"NO");
        }
        out.flush();
        out.close();
    }
    public static PrintWriter out;
    public static class MyScanner{
        BufferedReader br;
        StringTokenizer st;
        MyScanner(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while (st==null || !st.hasMoreElements()){
                try {
                    st=new StringTokenizer(br.readLine());
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
    }
}
