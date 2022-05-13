import java.io.*;
import java.util.StringTokenizer;

public class JotyAndChocolate {
    static long LCM(int a,int b){
        return a/GCD(a,b)*b;
    }
    static long GCD(int a,int b){
        if(b==0){
            return a;
        }
        return GCD(b,a%b);
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        out=new PrintWriter(new BufferedOutputStream(System.out));
        int n=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt(),p=sc.nextInt(),q=sc.nextInt();long ans=0;
       ans+= (long) (n / a) *p;ans+= (long) (n / b) *q;ans-= (long) (n / LCM(a, b)) *Math.min(p,q);
        out.print(ans);
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
