import java.io.*;
import java.util.StringTokenizer;

public class BatchSort {
    static boolean check(int x,int y,int[][] arr,int n,int m){
        for(int i=1;i<=n;i++){
            int t = 0,f=0;
            for(int j=1;j<=m;j++){
                t=arr[i][j];
                if(j==x){
                    t=arr[i][y];
                }
                if(j==y){
                    t=arr[i][x];
                }
                if(t!=j){
                    f++;
                }
            }
            if(f!=0 && f!=2){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        out=new PrintWriter(new BufferedOutputStream(System.out));
        int n=sc.nextInt(),m=sc.nextInt();
        int[][] arr=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m;j++){
                if(check(i,j,arr,n,m)){
                    out.println("YES");
                    out.close();
                }
            }
        }
        out.println("NO");
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
