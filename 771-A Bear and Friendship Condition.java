import java.io.*;
import java.util.*;

public class BearAndFriendshipCondition {
    static int MX=150005,cntV,cntE;
    static ArrayList<Integer>[] G=new ArrayList[MX];
    static boolean[] vis=new boolean[MX];

    static void init(int n){
        for(int i=1;i<=n;i++){
            G[i]=new ArrayList<>();
            vis[i]=false;
        }
    }
    static void dfs(int src,int V,int E){
        vis[src]=true;
        ++cntV;
        cntE+=G[src].size();
        for (int it:G[src]){
            if(!vis[it]){
                dfs(it,cntV,cntE);
            }
        }
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        out=new PrintWriter(new BufferedOutputStream(System.out));
        int n=sc.nextInt(),m=sc.nextInt();
        init(n);
        while (m-->0){
          int x=sc.nextInt(),y=sc.nextInt();
          G[x].add(y);
          G[y].add(x);
        }
        for(int i=1;i<=n;i++) {
            if (!vis[i]) {
                cntV = 0;
                cntE = 0;
                dfs(i, cntV, cntE);
                if (cntE != (long) cntV * (cntV - 1)) {
                    out.println("NO");
                    out.flush();
                    out.close();
                }
            }
        }
        out.println("YES");
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
