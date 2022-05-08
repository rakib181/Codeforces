import java.util.*;
import java.io.*;
public class TokitsukazeAndGood01StringHardVersion{
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),ans=0,sub=1,rem=-1;
            String s=sc.next();

            for(int i=0;i<n-1;i+=2){
                if(s.charAt(i)!=s.charAt(i+1)){
                    ans++;
                }else{
                    if(rem==-1)rem=s.charAt(i)-'0';
                    else if(rem!=s.charAt(i)-'0'){
                        sub++;
                        rem=s.charAt(i)-'0';
                    }
                }
            }
            out.println(ans+" "+sub);
        }
        out.flush();
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
