import java.util.*;
public class NewYearTransportation {
	static int MX=1000007;
    static ArrayList<ArrayList<Integer>>graph=new ArrayList<ArrayList<Integer>>();
    static boolean[] vis=new boolean[MX];
    static void dfs(int node) {
    	vis[node]=true;
    	for(int i=0;i<graph.get(node).size();i++) {
    		int nxt=graph.get(node).get(i);
    		if(vis[nxt]==false) {
    			dfs(nxt);
    		}
    	}
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),t=sc.nextInt();
		Arrays.fill(vis, false);
        for(int i=0;i<MX;i++) {
        	graph.add(new ArrayList<Integer>());
        }
        for(int i=1;i<n;i++) {
        	int a=sc.nextInt();
        	graph.get(i).add(i+a);
        }
        dfs(1);
        if(vis[t]==true) {
        	System.out.println("YES");
        }else {
        	System.out.println("NO");
        }
	}
}
