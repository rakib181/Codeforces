import java.io.*;
import java.util.*;

public class KanaAndDragonQuestGame {
    public static void main(String[] args) {
        OutputStream ot=System.out;
        out=new PrintWriter(ot);
        MyScanner sc=new MyScanner();
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt(),n=sc.nextInt(),m=sc.nextInt();
            while (n>0 && (x/2)+10<x){
                x=(x/2)+10;
                n--;
            }
           out.println((m*10)>=x?"YES":"NO");
        }
        out.flush();
        out.close();
    }
    public static PrintWriter out;
    public static class MyScanner {
        static BufferedReader br;
        static StringTokenizer st;
        public MyScanner(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        static String next(){
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
