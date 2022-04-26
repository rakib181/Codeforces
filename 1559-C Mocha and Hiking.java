import java.util.*;

public class MochaAndHiking {
    static ArrayList<ArrayList<Integer>>G=new ArrayList<>();
    static int MX=100005;
    static boolean[] vis=new boolean[MX];

    static void init(int n){
        for(int i=1;i<=n+1;i++){
            G.add(new ArrayList<>());
        }
        Arrays.fill(vis,false);
    }
    static void addEgde(int u,int v){
        G.get(u).add(v);
    }
    static void dfs(int src){
        vis[src]=true;
        System.out.print(src+" ");
        for (int i=0;i<G.get(src).size();i++){
            int nxt=G.get(src).get(i);
            if (!vis[nxt]){
                dfs(nxt);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
           int n=sc.nextInt(),src=0;
          // init(n+1);
           for(int i=1;i<=n;i++){
               int x=sc.nextInt();
               if(x==0){
                   src=i;
                 // addEgde(i,n+1);
                 // addEgde(n+1,i);
                     // src = i;
               }else{
                 //  addEgde(n+1,i);
                   //addEgde(i,n+1);
               }
           }
           //dfs(src);
         //   System.out.println();

            for (int i=1;i<=src;i++){
                System.out.print(i+" ");
            }
            System.out.print((n+1)+" ");
            for (int i=src+1;i<=n;i++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
