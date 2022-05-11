import java.io.*;
import java.util.*;

public class Reverse {
    static void swap(int i,int j,int[] arr){
       int tmp=arr[i];
       arr[i]=arr[j];
       arr[j]=tmp;
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        out=new PrintWriter(new BufferedOutputStream(System.out));
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),idx1=0,idx2=0,val=0;boolean flag1=false,flag2=false;
            int[] arr=new int[n+1];
            for(int i=1;i<=n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]!=i && !flag1){
                    idx1=i;val=i;flag1=true;
                }
                if(val==arr[i] && !flag2 && i>idx1){
                    idx2=i;flag2=true;
                }
            }
            while (idx1<=idx2){
                swap(idx1,idx2,arr);
                idx1++;idx2--;
            }
            for (int i=1;i<=n;i++){
                out.print(arr[i]+" ");
            }
            out.println();
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
