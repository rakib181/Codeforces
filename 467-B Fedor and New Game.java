import java.io.*;
import java.util.StringTokenizer;
public class FedorAndNewGame {
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        out=new PrintWriter(new BufferedOutputStream(System.out));
        int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt(),cnt=0,tmp;
        int[] arr=new int[m+1];
        for(int i=0;i<m+1;i++){
            arr[i]= sc.nextInt();
        }
        for (int i=0;i<m;i++){
            int BIT=arr[i]^arr[m];tmp=0;
            char[] G=Integer.toBinaryString(BIT).toCharArray();
            for (char c : G) {
                if (c == '1') tmp++;
            }
            if(tmp<=k)cnt++;
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
    }
}
