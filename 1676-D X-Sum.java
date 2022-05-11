import java.io.*;
import java.util.*;
public class TwoDimGridTrav {
    static int MX=105;static long ans,FANS;
    static boolean[][] vis;
    static int[] dx=new int[]{-1,-1,1,1};
    static int[] dy=new int[]{-1,1,-1,1};
    static void dfs(int x,int y,int n,int m,int[][] arr){
        if(x<0 || y<0 || x>=n || y>=m)return;
        if(vis[x][y]){
           return;
        }
        vis[x][y]=true;
        ans+=arr[x][y];
            int xi=x+dx[0];int yi=y+dy[0];
            dfs(xi,yi,n,m,arr);
            vis[x][y]=false;
    }
    static void dfs1(int x,int y,int n,int m,int[][] arr){
        if(x<0 || y<0 || x>=n || y>=m)return;
        if(vis[x][y]){
            return;
        }
        vis[x][y]=true;
        ans+=arr[x][y];
        int xi=x+dx[1];int yi=y+dy[1];
        dfs1(xi,yi,n,m,arr);
        vis[x][y]=false;
    }
    static void dfs2(int x,int y,int n,int m,int[][] arr){
        if(x<0 || y<0 || x>=n || y>=m)return;
        if(vis[x][y]){
            return;
        }
        vis[x][y]=true;
        ans+=arr[x][y];
        int xi=x+dx[2];int yi=y+dy[2];
        dfs2(xi,yi,n,m,arr);
        vis[x][y]=false;
    }
    static void dfs3(int x,int y,int n,int m,int[][] arr){
        if(x<0 || y<0 || x>=n || y>=m)return;
        if(vis[x][y]){
            return;
        }
        vis[x][y]=true;
        ans+=arr[x][y];
        int xi=x+dx[3];int yi=y+dy[3];
        dfs3(xi,yi,n,m,arr);
        vis[x][y]=false;
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        out=new PrintWriter(new BufferedOutputStream(System.out));
        int t=sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt(), m = sc.nextInt();
            int[][] arr = new int[n+1][m+1];
            vis=new boolean[n+1][m+1];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            FANS=Integer.MIN_VALUE;ans=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    dfs(i, j,n, m, arr);
                    dfs1(i, j,n, m, arr);
                    dfs2(i, j,n, m, arr);
                    dfs3(i, j,n, m, arr);
                    FANS = Math.max(ans-(3L *arr[i][j]), FANS);
                    ans = 0;
                }
            }
            out.println(FANS);
        }
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
            while (st==null ||!st.hasMoreElements()){
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
