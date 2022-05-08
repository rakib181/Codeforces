import java.util.*;
import java.io.*;
public class TokitsukazeAndAllZeroSequence{
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        //CODE HERE
         int t=sc.nextInt();
         while (t-->0){
             int n=sc.nextInt(),cnt=0,z=0;
             int[] arr=new int[n];
             for(int i=0;i<n;i++){
                 arr[i]=sc.nextInt();
                 if(arr[i]==0){
                     z++;
                 }
             }
             Arrays.sort(arr);boolean ok=false;
             if(arr[0]==0){
                 out.println(n-z);
                 continue;
             }
             for (int i=0;i<n-1;i++){
                 if(arr[i]==arr[i+1]){
                    ok=true;
                 }
             }
             if(ok){
                out.println(n-z);
             }else{
                 out.println(n+1-z);
             }
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
