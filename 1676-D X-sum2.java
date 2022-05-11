import java.io.*;
import java.util.StringTokenizer;

public class XSum {
    static long sum(int i,int j,int n,int m,int[][] board){
        long ans=board[i][j];
        int[] dx={-1,-1,1,1},dy={-1,1,-1,1};
        for(int d=0;d<4;d++){
           for(int k=1;true;k++){
               int xi=i+dx[d]*k,yi=j+dy[d]*k;
               if(xi<0 || yi<0 || xi>=n || yi>=m)break;
               ans+=board[xi][yi];
           }
        }
        return ans;
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        out=new PrintWriter(new BufferedOutputStream(System.out));
        int t=sc.nextInt();
        while (t-->0){
           int n=sc.nextInt(),m=sc.nextInt();
           int[][] board=new int[n][m];
           for(int i=0;i<n;i++){
               for(int j=0;j<m;j++){
                   board[i][j]=sc.nextInt();
               }
           }
           long ans=0;
           for(int i=0;i<n;i++){
               for (int j=0;j<m;j++){
                  ans=Math.max(ans,sum(i,j,n,m,board));
               }
           }
           out.println(ans);
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
