import java.util.*;
        import java.io.*;
public class TokitsukazeAndGood01StringEasyVersion{
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        //CODE HERE
         int t=sc.nextInt();
         while (t-->0){
             int n=sc.nextInt();
             String s=sc.next();
             int ans=0;
             for(int i=1;i<n;i++){
                 if(s.charAt(i)==s.charAt(i-1)){
                     i++;
                 }else {
                     ans++;
                     i++;
                 }
             }
             out.println(ans);
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
