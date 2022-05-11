import java.io.*;
import java.util.*;

public class MostSimilarWords {
    static int dif(String s1,String s2){
        int ans=0;
        for(int i=0;i<s1.length();i++){
            ans+=Math.abs(s1.charAt(i)-s2.charAt(i));
        }
        return ans;
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        out=new PrintWriter(new BufferedOutputStream(System.out));
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),m=sc.nextInt();
            String[] str=new String[n];
           for (int i=0;i<n;i++){
               str[i]=sc.next();
           }
           int MIN=Integer.MAX_VALUE;
           for(int i=0;i<n;i++){
               for (int j=i+1;j<n;j++){
                   MIN=Math.min(MIN,dif(str[i],str[j]));
               }
           }
           out.println(MIN);
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
                    st = new StringTokenizer(br.readLine());
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
