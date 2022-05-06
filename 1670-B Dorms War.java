import java.util.*;
import java.io.*;
public class DormsWar{
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
                //code here
                int t=sc.nextInt();
                while (t-->0){
                    int n=sc.nextInt();
                    String s=sc.next();
                    Set<Character>set=new HashSet<>();
                    int c=sc.nextInt();
                    while (c-->0){
                        char ch=sc.next().charAt(0);
                        set.add(ch);
                    }
                    int cnt=0,tmp=0;
                    for (int i=0;i<n;i++){
                        if(set.contains(s.charAt(i))){
                            cnt=Math.max(cnt,tmp);
                            tmp=1;
                            continue;
                        }
                        tmp++;
                    }
                    out.println(cnt);
                }
               out.close();
            }


    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;

    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }

}
