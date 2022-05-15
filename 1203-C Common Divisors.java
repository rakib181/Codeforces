import java.io.*;
import java.util.StringTokenizer;

public class CD {
    static long GCD(long x,long y){
        if(y==0){
            return x;
        }
        return GCD(y,x%y);
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        out=new PrintWriter(new BufferedOutputStream(System.out));
        int n=sc.nextInt(),cnt=0;long _gcd=0;
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
            _gcd=GCD(_gcd,arr[i]);
        }
        for (int i = 1; (long) i * i <=_gcd; i++){
            if(_gcd%i==0){
               cnt++;
            if(i!=_gcd/i) {
                cnt++;
            }
            }
        }
        out.println(cnt);
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
        long nextLong(){
            return Long.parseLong(next());
        }
    }
}
